package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a066.A066272;

/**
 * A073568 Number of anti-divisors of n divides the number of divisors of n.
 * @author Sean A. Irvine
 */
public class A073568 extends Sequence1 {

  private final DirectSequence mAnti = new A066272();
  private int mN = 2;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA0.l(++mN) % mAnti.a(mN).longValueExact() == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
