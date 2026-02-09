package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A083710 Number of integer partitions of n with a part dividing all the other parts.
 * @author Sean A. Irvine
 */
public class A083710 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return Integers.SINGLETON.sumdiv(mN, d -> Functions.PARTITIONS.z(d - 1));
  }
}
