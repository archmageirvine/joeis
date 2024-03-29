package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqnum 862 at 2019-07-04 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A042664 Numerators of continued fraction convergents to sqrt(862).
 * @author Georg Fischer
 */
public class A042664 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042664() {
    super(0, 862);
  }

  @Override
  public Z next() {
    final Z result = getNumerator();
    iterate();
    iterateConvergents();
    return result;
  } // next
}
