package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqnum 578 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A042106 Numerators of continued fraction convergents to sqrt(578).
 * @author Georg Fischer
 */
public class A042106 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042106() {
    super(0, 578);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}
