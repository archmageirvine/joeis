package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqnum 153 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A041280 Numerators of continued fraction convergents to sqrt(153).
 * @author Georg Fischer
 */
public class A041280 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041280() {
    super(0, 153);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}
