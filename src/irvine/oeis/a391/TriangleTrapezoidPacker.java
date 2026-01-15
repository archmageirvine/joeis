package irvine.oeis.a391;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.oeis.a391.A391498.Trapezoid;

public final class TriangleTrapezoidPacker {

  /* ================= triangle cell ================= */

  private static final class Cell {
    final int x, y;
    final boolean down; // false = up, true = down

    Cell(int x, int y, boolean down) {
      this.x = x;
      this.y = y;
      this.down = down;
    }

    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Cell)) return false;
      Cell c = (Cell) o;
      return x == c.x && y == c.y && down == c.down;
    }

    @Override
    public int hashCode() {
      return ((x * 1315423911) ^ (y * 2654435761L > 0 ? y : -y)) ^ (down ? 1 : 0);
    }
  }

  private static final class Shape {
    final Cell[] cells;

    Shape(List<Cell> list) {
      cells = list.toArray(new Cell[0]);
    }
  }

  /* ================= board ================= */

  private final int n;
  private final Map<Cell, Integer> idMap = new HashMap<>();
  private final Cell[] boardCells;
  private final boolean[] used;

  private final List<Trapezoid> pieces;
  private final Map<Trapezoid, List<Shape>> orientations = new HashMap<>();

  /* ================= constructor ================= */

  public TriangleTrapezoidPacker(int side, List<Trapezoid> input) {

    this.n = side;

    pieces = new ArrayList<>(input);
    pieces.sort(Collections.reverseOrder());

    List<Cell> board = new ArrayList<>();

// Up triangles
    for (int y = 0; y < n; y++) {
      for (int x = 0; x + y < n; x++) {
        board.add(new Cell(x, y, false));
      }
    }

// Down triangles
    for (int y = 0; y < n - 1; y++) {
      for (int x = 0; x + y < n - 1; x++) {
        board.add(new Cell(x, y, true));
      }
    }

    boardCells = board.toArray(new Cell[0]);
    for (int i = 0; i < boardCells.length; i++) {
      idMap.put(boardCells[i], i);
    }

    used = new boolean[boardCells.length];

    for (Trapezoid t : pieces) {
      orientations.put(t, buildOrientations(t));
    }
  }

  /* ================= public ================= */

  public boolean canPack() {
    return backtrack(0);
  }

  /* ================= backtracking ================= */

  private boolean backtrack(int idx) {
    if (idx == pieces.size()) return true;

    int hole = firstFree();
    Cell target = boardCells[hole];

    Trapezoid t = pieces.get(idx);

    for (Shape s : orientations.get(t)) {
      for (Cell c : s.cells) {

        int dx = target.x - c.x;
        int dy = target.y - c.y;

        if (c.down != target.down) continue;

        if (canPlace(s, dx, dy)) {
          place(s, dx, dy, true);
          if (backtrack(idx + 1)) return true;
          place(s, dx, dy, false);
        }
      }
    }
    return false;
  }

  private int firstFree() {
    for (int i = 0; i < used.length; i++) {
      if (!used[i]) return i;
    }
    throw new IllegalStateException();
  }

  /* ================= placement ================= */

  private boolean canPlace(Shape s, int dx, int dy) {
    for (Cell c : s.cells) {
      Cell t = new Cell(c.x + dx, c.y + dy, c.down);
      Integer id = idMap.get(t);
      if (id == null || used[id]) return false;
    }
    return true;
  }

  private void place(Shape s, int dx, int dy, boolean v) {
    for (Cell c : s.cells) {
      Cell t = new Cell(c.x + dx, c.y + dy, c.down);
      used[idMap.get(t)] = v;
    }
  }

  /* ================= trapezoid discretization ================= */

  private static Shape canonicalShape(Trapezoid t) {

    int b = t.mBase;
    int h = t.mHeight;
    int top = b - h;

    List<Cell> cells = new ArrayList<>();

    for (int i = 0; i < h; i++) {

      int len = 2 * (top + i) + 1;   // number of triangles in this row

      for (int k = 0; k < len; k++) {

        boolean down = (k & 1) == 1;   // alternate orientations

        int x = k;
        int y = i;

        cells.add(new Cell(x, y, down));
      }
    }

    if (cells.size() != t.getArea()) {
      throw new IllegalStateException(
        "Area mismatch for " + t + " got " + cells.size());
    }

    return new Shape(cells);
  }

  /* ================= symmetries ================= */

  private static Cell rot(Cell c, int k) {
    int x = c.x, y = c.y;
    boolean d = c.down;

    switch (k) {
      case 0:
        return new Cell(x, y, d);
      case 1:
        return new Cell(-y, x + y, !d);
      case 2:
        return new Cell(-x - y, x, d);
      case 3:
        return new Cell(-x, -y, !d);
      case 4:
        return new Cell(y, -x - y, d);
      case 5:
        return new Cell(x + y, -x, !d);
      default:
        throw new IllegalArgumentException();
    }
  }

  private static Cell mirror(Cell c) {
    return new Cell(c.x, -c.y, c.down);
  }

  private static Shape normalize(List<Cell> cells) {
    int minx = Integer.MAX_VALUE, miny = Integer.MAX_VALUE;
    for (Cell c : cells) {
      minx = Math.min(minx, c.x);
      miny = Math.min(miny, c.y);
    }
    List<Cell> out = new ArrayList<>();
    for (Cell c : cells) {
      out.add(new Cell(c.x - minx, c.y - miny, c.down));
    }
    return new Shape(out);
  }

  private static String key(Shape s) {
    StringBuilder sb = new StringBuilder();
    for (Cell c : s.cells) {
      sb.append(c.x).append(',').append(c.y).append(',').append(c.down ? 1 : 0).append(';');
    }
    return sb.toString();
  }

  private static List<Shape> buildOrientations(Trapezoid t) {

    Shape base = canonicalShape(t);
    Map<String, Shape> uniq = new HashMap<>();

    for (int r = 0; r < 6; r++) {

      List<Cell> a = new ArrayList<>();
      List<Cell> b = new ArrayList<>();

      for (Cell c : base.cells) {
        Cell rc = rot(c, r);
        a.add(rc);
        b.add(mirror(rc));
      }

      Shape s1 = normalize(a);
      Shape s2 = normalize(b);

      uniq.putIfAbsent(key(s1), s1);
      uniq.putIfAbsent(key(s2), s2);
    }

    return new ArrayList<>(uniq.values());
  }

  /* ================= test ================= */

  public static void main(String[] args) {

    List<Trapezoid> a = List.of(
      new Trapezoid(2, 1),
      new Trapezoid(3, 1),
      new Trapezoid(4, 1),
      new Trapezoid(5, 1),
      new Trapezoid(4, 2)
    );

    System.out.println(new TriangleTrapezoidPacker(6, a).canPack()); // true

    List<Trapezoid> b = List.of(
      new Trapezoid(5, 3),
      new Trapezoid(7, 1),
      new Trapezoid(4, 1),
      new Trapezoid(3, 1),
      new Trapezoid(2, 1)
    );

    System.out.println(new TriangleTrapezoidPacker(7, b).canPack()); // true
  }
}
