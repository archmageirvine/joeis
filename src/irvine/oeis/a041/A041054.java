package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqnum 33 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A041054 Numerators of continued fraction convergents to sqrt(33).
 * @author Georg Fischer
 */
public class A041054 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041054() {
    super(0, 33);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}
