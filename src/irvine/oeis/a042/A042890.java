package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqnum 977 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A042890 Numerators of continued fraction convergents to sqrt(977).
 * @author Georg Fischer
 */
public class A042890 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042890() {
    super(0, 977);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}
