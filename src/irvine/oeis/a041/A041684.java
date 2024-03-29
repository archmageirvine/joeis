package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqnum 362 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A041684 Numerators of continued fraction convergents to sqrt(362).
 * @author Georg Fischer
 */
public class A041684 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041684() {
    super(0, 362);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}
