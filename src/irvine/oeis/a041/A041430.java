package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqnum 231 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A041430 Numerators of continued fraction convergents to sqrt(231).
 * @author Georg Fischer
 */
public class A041430 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041430() {
    super(0, 231);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}
