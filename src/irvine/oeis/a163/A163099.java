package irvine.oeis.a163;
// Generated by gen_seq4.pl seqop a163 A163097 divide(2) 1 at 2020-01-25 22:40
// DO NOT EDIT here!

import irvine.math.z.Z;

/**
 * A163099 a(n) = A163097(n)/2.
 * @author Georg Fischer
 */
public class A163099 extends A163097 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
