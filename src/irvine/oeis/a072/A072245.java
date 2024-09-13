package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A072140.
 * @author Sean A. Irvine
 */
public class A072245 extends Sequence0 {

  private Z mN = null;
  private long mM = 1;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(10);
    while (Functions.DISTINCT_PARTITIONS.z(mM).compareTo(mN) < 0) {
      ++mM;
    }
    return Z.valueOf(mM);
  }
}
