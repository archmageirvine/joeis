package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059138 A hierarchical sequence (S(W3{2,2}cc) - see A059126).
 * @author Sean A. Irvine
 */
public class A059138 extends A059137 {

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

