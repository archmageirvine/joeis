package irvine.oeis.a260;
// Generated by gen_seq4.pl bref at 2020-11-27 17:17
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.BriefSequence;


/**
 * A260002 Sudan Numbers: a(n)= f(n,n,n) where f is the Sudan function.
 *
 * @author Georg Fischer
 */
public class A260002 extends BriefSequence {

  /** Construct the sequence. */
  public A260002() {
    super(Z.ZERO, Z.THREE, new Z("15569256417"));
  }
}
