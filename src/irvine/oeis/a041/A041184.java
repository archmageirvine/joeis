package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqnum 103 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A041184 Numerators of continued fraction convergents to sqrt(103).
 * @author Georg Fischer
 */
public class A041184 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041184() {
    super(0, 103);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}
