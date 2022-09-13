package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059142 A hierarchical sequence (S(W2{3}*) - see A059126).
 * @author Sean A. Irvine
 */
public class A059142 extends A059141 {

  private int mN = -1;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    ++mN;
    long m = 0;
    final long lim = 1L << mN;
    while (m < lim) {
      mSum = mSum.add(super.next());
      ++m;
    }
    return mSum;
  }
}

