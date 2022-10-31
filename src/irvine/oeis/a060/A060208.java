package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000720;

/**
 * A060208 a(n) = 2*pi(n) - pi(2*n), where pi(i) = A000720(i).
 * @author Sean A. Irvine
 */
public class A060208 extends Sequence1 {

  private final A000720 mA = new A000720();
  private final A000720 mB = new A000720();

  @Override
  public Z next() {
    mB.next();
    return mA.next().multiply2().subtract(mB.next());
  }
}
