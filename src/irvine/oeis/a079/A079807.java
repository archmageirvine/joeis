package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A079804.
 * @author Sean A. Irvine
 */
public class A079807 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN % 3 != 0) {
      return Z.ZERO;
    }
    final int[] counts = ZUtils.digitCounts(mN);
    return Binomial.multinomial(Functions.SUM.i(counts), counts);
  }
}

