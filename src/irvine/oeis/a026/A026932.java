package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026932 Triangular array T read by rows: <code>T(n,k) =</code> number of partitions of n into an even number of parts, each <code>&lt;=</code> k.
 * @author Sean A. Irvine
 */
public class A026932 extends A026920 {

  private long mN = 0;
  private long mM = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
      mSum = Z.ZERO;
    }
    mSum = mSum.add(mE.get(mN, mM));
    return mSum;
  }
}
