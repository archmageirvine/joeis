package irvine.oeis.a139;
// Generated by gen_seq4.pl dersimple at 2021-08-25 22:45

import irvine.math.z.Z;

/**
 * A139481 a(n) = A139480(n)/2.
 * @author Georg Fischer
 */
public class A139481 extends A139480 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
