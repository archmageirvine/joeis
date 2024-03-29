package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqnum 765 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A042474 Numerators of continued fraction convergents to sqrt(765).
 * @author Georg Fischer
 */
public class A042474 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042474() {
    super(0, 765);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}
