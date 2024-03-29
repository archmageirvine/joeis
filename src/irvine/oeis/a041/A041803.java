package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqden 422 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A041803 Denominators of continued fraction convergents to sqrt(422).
 * @author Georg Fischer
 */
public class A041803 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041803() {
    super(0, 422);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
