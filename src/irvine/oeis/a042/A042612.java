package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqnum 835 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A042612 Numerators of continued fraction convergents to sqrt(835).
 * @author Georg Fischer
 */
public class A042612 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042612() {
    super(0, 835);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}
