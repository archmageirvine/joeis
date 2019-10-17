package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026921 Triangular array E by rows: <code>E(n,k) =</code> number of partitions of n into an even number of parts, the greatest being k.
 * @author Sean A. Irvine
 */
public class A026921 extends A026920 {

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
