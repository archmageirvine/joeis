package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072140.
 * @author Sean A. Irvine
 */
public class A072212 extends Sequence1 {

  private Z mN = Z.ONE;
  private long mM = 6;

  @Override
  public Z next() {
    mN = mN.multiply(10);
    while (Functions.PARTITIONS.z(mM).compareTo(mN) < 0) {
      ++mM;
    }
    return Z.valueOf(mM);
  }
}
