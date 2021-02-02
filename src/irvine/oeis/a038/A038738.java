package irvine.oeis.a038;

import irvine.math.z.Z;

/**
 * A038738 Path-counting array T(i,j) obtained from array t in A038792 by T(i,j)=t(2i+1,j).
 * @author Sean A. Irvine
 */
public class A038738 extends A038792 {

  private long mN = 0;
  private long mM = 0;

  protected Z t(final long n, final long m) {
    return get(2 * n + 1 - m, m);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}
