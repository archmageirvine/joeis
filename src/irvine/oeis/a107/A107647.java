package irvine.oeis.a107;
// manually knest/eulphi at 2023-03-01 16:41

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a000.A000073;

/**
 * A107647 Euler&apos;s totient function applied to tribonacci numbers.
 * @author Georg Fischer
 */
public class A107647 extends A000073 {

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return Euler.phi(super.next());
  }
}
