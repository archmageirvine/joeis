package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqnum 783 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A042510 Numerators of continued fraction convergents to sqrt(783).
 * @author Georg Fischer
 */
public class A042510 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042510() {
    super(0, 783);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}
