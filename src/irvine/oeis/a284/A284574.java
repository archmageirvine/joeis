package irvine.oeis.a284;
// Generated by gen_seq4.pl dersimple at 2021-08-21 22:23

import irvine.math.z.Z;
import irvine.oeis.a048.A048724;

/**
 * A284574 a(n) = A048724(n) mod 3.
 * @author Georg Fischer
 */
public class A284574 extends A048724 {

  @Override
  public Z next() {
    return super.next().mod(Z.THREE);
  }
}
