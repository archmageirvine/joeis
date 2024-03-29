package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqnum 389 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A041738 Numerators of continued fraction convergents to sqrt(389).
 * @author Georg Fischer
 */
public class A041738 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041738() {
    super(0, 389);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}
