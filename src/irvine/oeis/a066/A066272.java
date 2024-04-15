package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A066272 Number of anti-divisors of n.
 * @author Sean A. Irvine
 */
public class A066272 extends Sequence1 implements DirectSequence {

  private int mN = 0;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    long c = 0;
    for (final Z d : Jaguar.factor(n).divisors()) {
      if (d.isOdd()) {
        ++c;
      }
    }
    final Z n2 = n.multiply2();
    final Z s0 = Functions.SIGMA0.z(n2.subtract(1));
    final Z s1 = Functions.SIGMA0.z(n2.add(1));
    return s0.add(s1).add(c - 5).max(Z.ZERO);
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }
}
