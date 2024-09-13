package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A072239 a(0) = 11; a(n) = number of distinct partitions of the previous term.
 * @author Sean A. Irvine
 */
public class A072239 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(11) : Functions.DISTINCT_PARTITIONS.z(mA);
    return mA;
  }
}
