package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqnum 596 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A042142 Numerators of continued fraction convergents to sqrt(596).
 * @author Georg Fischer
 */
public class A042142 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042142() {
    super(0, 596);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}
