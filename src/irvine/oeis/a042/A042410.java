package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqnum 733 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A042410 Numerators of continued fraction convergents to sqrt(733).
 * @author Georg Fischer
 */
public class A042410 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042410() {
    super(0, 733);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}
