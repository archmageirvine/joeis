package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a038.A038547;

/**
 * A005179 Smallest number with exactly n divisors.
 * @author Sean A. Irvine
 */
public class A005179 extends A038547 implements DirectSequence {

  @Override
  protected long start() {
    return 2;
  }

  @Override
  public Z a(final Z n) {
    return super.a(n);
  }

  @Override
  public Z a(final long n) {
    return super.a(n);
  }

}
