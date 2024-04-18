package irvine.oeis.a058;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A058880 a(n) = (1/(2n)) * Sum_{d|n} phi(d) * 2^(2n/d) + (2^((n-4)/2), if n is even).
 * @author Sean A. Irvine
 */
public class A058880 extends Sequence3 {

  private int mN = 2;

  @Override
  public Z next() {
    ++mN;
    final Z sum = Integers.SINGLETON.sumdiv(mN, d -> {
      return Functions.PHI.z(Z.valueOf(d)).shiftLeft(2L * mN / d);
    }).divide(2L * mN);
    return (mN & 1) == 0 ? sum.add(Z.ONE.shiftLeft((mN - 4) / 2)) : sum;
  }
}
