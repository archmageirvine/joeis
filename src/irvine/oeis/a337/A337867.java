package irvine.oeis.a337;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A337867 Number of polyfetts (or polifetti) with n cells, identifying mirror images.
 * @author George Sicherman
 * @author Sean A. Irvine (Java port)
 */
public class A337867 extends Sequence1 {

  // Sector encoding, thus using bottom and left is 1|2 = 3.
  //   8
  //  +-+
  // 4| |2
  //  +-+
  //   1
  private static final int NONE = 0;
  private static final int S = 1;
  private static final int E = 2;
  private static final int W = 4;
  private static final int N = 8;
  private static final int SE = S | E;
  private static final int SW = S | W;
  private static final int NE = N | E;
  private static final int NW = N | W;
  private static final int ALL = N | S | E | W;
  private static final int NOT_N = S | E | W;
  private static final int NOT_S = N | E | W;
  private static final int NOT_E = N | S | W;
  private static final int NOT_W = N | S | E;

  private static final int MAX = 100;
  // Sector left-right reflection
  private static final int[] REFL_BITS = {
    NONE, S, W, SW, E, SE, E | W, NOT_N, N, N | S, NW, NOT_E, NE, NOT_W, NOT_S, ALL
  };
  // Sector anticlockwise rotation by 90 degrees
  private static final int[] ROT_BITS = {
    NONE, E, N, NE, S, SE, N | S, NOT_W, W, W | E, NW, NOT_S, SW, NOT_N, NOT_W, ALL
  };

  private int mN = 0;
  private HashMap<String, Cell[]> mRetained = new HashMap<>();

  private static final class Cell implements Comparable<Cell> {
    private int mX;
    private int mY;
    private int mSector;

    @Override
    public int compareTo(final Cell b) {
      int d = Integer.compare(mY, b.mY);
      if (d != 0) {
        return d;
      }
      d = Integer.compare(mX, b.mX);
      if (d != 0) {
        return d;
      }
      return Integer.compare(mSector, b.mSector);
    }

    @Override
    public int hashCode() {
      return mX * 65537 + mY * 17 + mSector;
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof Cell)) {
        return false;
      }
      final Cell o = (Cell) obj;
      return mX == o.mX && mY == o.mY && mSector == o.mSector;
    }

    @Override
    public String toString() {
      return "(" + mX + "," + mY + "," + mSector + ")";
    }
  }

  private int mNCells;
  private int mNWorkingCells;
  private int mNBestCells;
  private final Cell[] mCells = new Cell[MAX];
  private final Cell[] mWorkingCells = new Cell[MAX];
  private final Cell[] mBestCell = new Cell[MAX];

  {
    for (int k = 0; k < MAX; ++k) {
      mCells[k] = new Cell();
      mWorkingCells[k] = new Cell();
      mBestCell[k] = new Cell();
    }
  }

  protected void add(final int x, final int y, final int sector) {
    if (sector != 0) {
      mCells[mNCells].mX = x;
      mCells[mNCells].mY = y;
      mCells[mNCells].mSector = sector;
      ++mNCells;
    }
    //System.out.println("Considering: " + toString(mCells, mNCells));
    canonize();      /* Writes into bcells[] */
    show();        /* Retain the contents */

    if (sector != 0) {
      --mNCells;    /* Restore the cell count. */
    }
  }

  /* Turn a polyabolo all different ways and choose the lexically first. */
  private void canonize() {
    mNWorkingCells = mNCells;
    for (int c = 0; c < mNCells; ++c) {
      mWorkingCells[c].mX = mCells[c].mX;
      mWorkingCells[c].mY = mCells[c].mY;
      mWorkingCells[c].mSector = mCells[c].mSector;
    }

    mNBestCells = 0;
    for (int refl = 0; refl < 2; ++refl) {
      for (int rot = 0; rot < 4; ++rot) {
        int ymin = Integer.MAX_VALUE;
        int xmin = Integer.MAX_VALUE;
        for (int c = 0; c < mNWorkingCells; ++c) {
          if (mWorkingCells[c].mX < xmin) {
            xmin = mWorkingCells[c].mX;
          }
          if (mWorkingCells[c].mY < ymin) {
            ymin = mWorkingCells[c].mY;
          }
        }
        for (int c = 0; c < mNWorkingCells; ++c) {
          mWorkingCells[c].mX -= xmin;
          mWorkingCells[c].mY -= ymin;
        }
        Arrays.sort(mWorkingCells, 0, mNWorkingCells);

        if (mNBestCells == 0 || lexBefore()) {
          mNBestCells = mNWorkingCells;
          for (int c = 0; c < mNWorkingCells; ++c) {
            mBestCell[c].mX = mWorkingCells[c].mX;
            mBestCell[c].mY = mWorkingCells[c].mY;
            mBestCell[c].mSector = mWorkingCells[c].mSector;
          }
        }
        // Rotate
        for (int c = 0; c < mNWorkingCells; ++c) {
          final int t = mWorkingCells[c].mY;
          mWorkingCells[c].mY = -mWorkingCells[c].mX;
          mWorkingCells[c].mX = t;
          mWorkingCells[c].mSector = ROT_BITS[mWorkingCells[c].mSector];
        }
      }
      // Reflect
      for (int c = 0; c < mNWorkingCells; ++c) {
        mWorkingCells[c].mX = -mWorkingCells[c].mX;
        mWorkingCells[c].mSector = REFL_BITS[mWorkingCells[c].mSector];
      }
    }
  }

  // Compare the current working polyabolo lexically to the "best" one.
  private boolean lexBefore() {
    for (int c = 0; c < mNWorkingCells; ++c) {
      final int d = mWorkingCells[c].compareTo(mBestCell[c]);
      if (d > 0) {
        return false;
      }
      if (d < 0) {
        return true;
      }
    }
    return false;  // identical
  }

  protected boolean vacant(final int x, final int y) {
    for (int c = 0; c < mNCells; ++c) {
      if (mCells[c].mX == x && mCells[c].mY == y) {
        return false;
      }
    }
    return true;
  }

  private String toString(final Cell[] b, final int cnt) {
    final StringBuilder sb = new StringBuilder();
    for (int c = 0; c < cnt; ++c) {
      sb.append(b[c]);
    }
    return sb.toString();
  }

  private Cell[] deepCopy(final Cell[] cells, final int nc) {
    final Cell[] copy = new Cell[nc];
    for (int k = 0; k < nc; ++k) {
      copy[k] = new Cell();
      copy[k].mX = cells[k].mX;
      copy[k].mY = cells[k].mY;
      copy[k].mSector = cells[k].mSector;
    }
    return copy;
  }

  private void show() {
    mRetained.put(toString(mBestCell, mNBestCells), deepCopy(mBestCell, mNBestCells));
  }

  protected void update(final int x, final int y, final int v) {
    // Orthogonal moves
    if ((v & NOT_N) != 0) {  /* go down */
      final int ynew = y + 1;
      if (vacant(x, ynew)) {
        add(x, ynew, NW);
        add(x, ynew, NE);
        if ((v & E) != 0) {  // Note excluding (v & S) here (and other similar situations) causes certain seemingly valid polyfetts to be missed
          add(x, ynew, SE);
        }
        if ((v & W) != 0) {
          add(x, ynew, SW);
        }
      }
    }
    if ((v & NOT_W) != 0) {  /* go right */
      final int xnew = x + 1;
      if (vacant(xnew, y)) {
        add(xnew, y, NW);
        add(xnew, y, SW);
        if ((v & S) != 0) {
          add(xnew, y, SE);
        }
        if ((v & N) != 0) {
          add(xnew, y, NE);
        }
      }
    }
    if ((v & NOT_E) != 0) {  /* go left */
      final int xnew = x - 1;
      if (vacant(xnew, y)) {
        add(xnew, y, NE);
        add(xnew, y, SE);
        if ((v & S) != 0) {
          add(xnew, y, SW);
        }
        if ((v & N) != 0) {
          add(xnew, y, NW);
        }
      }
    }
    if ((v & NOT_S) != 0) {  /* go up */
      final int ynew = y - 1;
      if (vacant(x, ynew)) {
        add(x, ynew, SW);
        add(x, ynew, SE);
        if ((v & E) != 0) {
          add(x, ynew, NE);
        }
        if ((v & W) != 0) {
          add(x, ynew, NW);
        }
      }
    }
    // Diagonal moves.
    if ((v & SE) != 0) {  /* down right. */
      final int xnew = x + 1;
      final int ynew = y + 1;
      if (vacant(xnew, ynew)) {
        add(xnew, ynew, SW);
        add(xnew, ynew, NE);
        add(xnew, ynew, NW);
      }
    }
    if ((v & SW) != 0) {  /* down left. */
      final int xnew = x - 1;
      final int ynew = y + 1;
      if (vacant(xnew, ynew)) {
        add(xnew, ynew, SE);
        add(xnew, ynew, NE);
        add(xnew, ynew, NW);
      }
    }
    if ((v & NE) != 0) {  /* up right. */
      final int xnew = x + 1;
      final int ynew = y - 1;
      if (vacant(xnew, ynew)) {
        add(xnew, ynew, SE);
        add(xnew, ynew, SW);
        add(xnew, ynew, NW);
      }
    }
    if ((v & NW) != 0) {  /* up left. */
      final int xnew = x - 1;
      final int ynew = y - 1;
      if (vacant(xnew, ynew)) {
        add(xnew, ynew, SE);
        add(xnew, ynew, SW);
        add(xnew, ynew, NE);
      }
    }
  }

  @Override
  public Z next() {
    if (++mN >= MAX) {
      throw new UnsupportedOperationException();
    }
    if (mRetained.isEmpty()) {
      final Cell t = new Cell();
      t.mX = 0;
      t.mY = 0;
      t.mSector = SE;
      mRetained.put(toString(mCells, 1), new Cell[] {t});
      return Z.ONE;
    } else {
      final Collection<Cell[]> values = mRetained.values();
      mRetained = new HashMap<>();
      for (final Cell[] r : values) {
        for (int k = 0; k < r.length; ++k) {
          mCells[k].mX = r[k].mX;
          mCells[k].mY = r[k].mY;
          mCells[k].mSector = r[k].mSector;
        }
        mNCells = r.length;

        //System.out.println("Starting: " + toString(r, r.length));

        // Adjoin a monabolo.
        for (int c = 0; c < mNCells; c++) {
          final int x = mCells[c].mX;
          final int y = mCells[c].mY;
          final int v = mCells[c].mSector;
          if (v != NONE && v != ALL) {  /* fill out the cell */
            mCells[c].mSector = ALL;
            add(0, 0, 0);    /* 0 means change nothing */
            mCells[c].mSector = v;  /* restore the value */
          }
          // Neighbor cell adjacencies.
          update(x, y, v);
        }
      }
    }
    return Z.valueOf(mRetained.size());
  }
}
