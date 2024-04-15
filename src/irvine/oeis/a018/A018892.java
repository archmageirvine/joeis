package irvine.oeis.a018;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A018892 Number of ways to write 1/n as a sum of exactly 2 unit fractions.
 * @author Sean A. Irvine
 */
public class A018892 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    final long s = mN * mN;
    return Functions.SIGMA0.z((mN & 1) == 0 ? s / 4 : s).subtract(1).divide2().add(1);
  }
}

