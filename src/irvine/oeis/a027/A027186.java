package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027186 Triangular array E by rows: E(n,k) = number of partitions of n into an even number of parts, the least being k.
 * @author Sean A. Irvine
 */
public class A027186 extends A027185 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return mE.get(mN, mM);
  }
}
