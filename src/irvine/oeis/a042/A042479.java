package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqden 767 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A042479 Denominators of continued fraction convergents to sqrt(767).
 * @author Georg Fischer
 */
public class A042479 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042479() {
    super(0, 767);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
