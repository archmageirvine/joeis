package irvine.oeis.a000;

import java.util.HashSet;
import java.util.Set;

import irvine.math.Polyomino;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Point;

/**
 * A000105 Number of free polyominoes (or square animals) with n cells.
 * @author Sean A. Irvine
 */
public class A000105 implements Sequence {

  protected static final Point ORIGIN = new Point(0, 0);
  protected HashSet<Polyomino> mA = null;

  protected void filter(final Set<Polyomino> polyominoes) {
  }

  protected Polyomino canonicalize(final Polyomino polyomino) {
    return polyomino.freeCanonical();
  }

  protected void addIfAbsent(final Set<Polyomino> nextSet, final Polyomino p, final Point c1) {
    if (!p.contains(c1)) {
      final Polyomino np = new Polyomino(p);
      np.add(c1);
      nextSet.add(canonicalize(np));
    }
  }

  protected void update(final HashSet<Polyomino> nextSet, final Polyomino p) {
    for (final Point cell : p) {
      final int left = cell.left();
      final int right = cell.right();
      addIfAbsent(nextSet, p, new Point(left - 1, right));
      addIfAbsent(nextSet, p, new Point(left + 1, right));
      addIfAbsent(nextSet, p, new Point(left, right - 1));
      addIfAbsent(nextSet, p, new Point(left, right + 1));
    }
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = new HashSet<>();
      return Z.ONE;
    }
    if (mA.isEmpty()) {
      final Polyomino p = new Polyomino();
      p.add(ORIGIN);
      mA.add(p);
    } else {
      final HashSet<Polyomino> nextSet = new HashSet<>();
      for (final Polyomino p : mA) {
        update(nextSet, p);
      }
      filter(nextSet);
      mA = nextSet;
      //System.out.println(mA);
    }
    return Z.valueOf(mA.size());
  }

}


// Alternative jmason implementation, problem is A006746 and other depend on the above
//  private int mMax = 0;
//
//  @Override
//  public Z next() {
//    final PolyominoCounter pc = new PolyominoCounter(++mMax, false, false, false);
//    pc.run(true, false, false);
//    return Z.valueOf(pc.getCu().getCounter(mMax));
//  }
