package irvine.oeis.a058;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058936 Decomposition of Stirling's S(n,2) based on associated numeric partitions.
 * @author Sean A. Irvine
 */
public class A058936 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (2 * ++mM > mN) {
      if (++mN == 1) {
        return Z.ZERO;
      }
      mM = 1;
    }
    final int b = mN - mM;
    return mM == b
      ? Functions.FACTORIAL.z(mN).divide(2L * b * b)
      : Functions.FACTORIAL.z(mN).divide((long) b * mM);
  }
}
