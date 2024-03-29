package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqnum 724 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A042394 Numerators of continued fraction convergents to sqrt(724).
 * @author Georg Fischer
 */
public class A042394 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042394() {
    super(0, 724);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}
