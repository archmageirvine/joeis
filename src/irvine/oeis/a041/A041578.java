package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqnum 307 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A041578 Numerators of continued fraction convergents to sqrt(307).
 * @author Georg Fischer
 */
public class A041578 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041578() {
    super(0, 307);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}
