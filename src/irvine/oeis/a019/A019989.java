package irvine.oeis.a019;

import java.util.Set;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A019989 Indices n such that A307672(2*n) = 0.
 * @author Sean A. Irvine
 */
public class A019989 extends Sequence0 {

  private Set<Z> mA = new TreeSet<>();
  private Set<Z> mB = new TreeSet<>();
  private Set<Z> mC = new TreeSet<>();
  private Set<Z> mBigA = new TreeSet<>();
  private Set<Z> mBigB = new TreeSet<>();
  private Set<Z> mBigC = new TreeSet<>();
  private Z mN = Z.ZERO;

  {
    step();
  }

  private Set<Z> union(final Set<Z> a, final Set<Z> b, final Set<Z> c) {
    final Set<Z> res = new TreeSet<>();
    for (final Z e : a) {
      res.add(e.multiply(3));
    }
    for (final Z e : b) {
      res.add(e.multiply(3).subtract(1));
    }
    for (final Z e : c) {
      res.add(e.multiply(3).add(1));
    }
    return res;
  }

  private void step() {
    final Set<Z> newA = union(mA, mBigB, mBigC);
    final Set<Z> newB = union(mB, mBigC, mBigA);
    final Set<Z> newC = union(mC, mBigA, mBigB);
    final Set<Z> newBigA = union(mBigA, mC, mB);
    final Set<Z> newBigB = union(mBigB, mA, mC);
    final Set<Z> newBigC = union(mBigC, mB, mA);
    newBigC.add(Z.ONE);
    mA = newA;
    mB = newB;
    mC = newC;
    mBigA = newBigA;
    mBigB = newBigB;
    mBigC = newBigC;
  }

  protected boolean accept(final Z n, final Set<Z> a, final Set<Z> b, final Set<Z> c) {
    return a.contains(n);
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (!mA.contains(mN) && !mB.contains(mN) && !mC.contains(mN)) {
        step();
      }
      if (accept(mN, mA, mB, mC)) {
        return mN.divide2();
      }
    }
  }
}
