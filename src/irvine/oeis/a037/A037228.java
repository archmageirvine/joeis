package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000010;
import irvine.oeis.a000.A000720;

/**
 * A037228 a(n) = phi(n) - pi(n).
 * @author Sean A. Irvine
 */
public class A037228 extends A000010 {

  private final Sequence mPrimePi = new A000720();

  @Override
  public Z next() {
    return super.next().subtract(mPrimePi.next());
  }
}
