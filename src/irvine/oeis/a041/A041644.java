package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqnum 341 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A041644 Numerators of continued fraction convergents to sqrt(341).
 * @author Georg Fischer
 */
public class A041644 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041644() {
    super(0, 341);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}
