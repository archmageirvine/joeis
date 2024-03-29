package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqnum 405 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A041768 Numerators of continued fraction convergents to sqrt(405).
 * @author Georg Fischer
 */
public class A041768 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041768() {
    super(0, 405);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}
