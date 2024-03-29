package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqnum 470 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A041896 Numerators of continued fraction convergents to sqrt(470).
 * @author Georg Fischer
 */
public class A041896 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041896() {
    super(0, 470);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}
