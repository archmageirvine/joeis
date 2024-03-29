package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqnum 670 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A042288 Numerators of continued fraction convergents to sqrt(670).
 * @author Georg Fischer
 */
public class A042288 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042288() {
    super(0, 670);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}
