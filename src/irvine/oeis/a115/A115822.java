package irvine.oeis.a115;
// Generated by gen_seq4.pl inbase2 at 2022-04-08 22:28

import irvine.math.z.Z;

/**
 * A115822 Sequence A115821 in binary.
 * @author Georg Fischer
 */
public class A115822 extends A115821 {

  @Override
  public Z next() {
    return new Z(super.next().toString(2));
  }
}
