package irvine.oeis.a054;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A054243 Number of partitions of n into distinct positive parts &lt;= n, where parts are combined by XOR.
 * @author Sean A. Irvine
 */
public class A054243 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN - IntegerUtils.lg(mN));
  }
}

