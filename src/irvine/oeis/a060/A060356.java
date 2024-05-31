package irvine.oeis.a060;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a058.A058863;

/**
 * A060356 Expansion of e.g.f.: -LambertW(-x/(1+x)).
 * @author Sean A. Irvine
 */
public class A060356 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Sequence s = new A058863();
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.add(Functions.STIRLING1.z(mN, k).multiply(s.next()));
    }
    return sum;
  }
}
