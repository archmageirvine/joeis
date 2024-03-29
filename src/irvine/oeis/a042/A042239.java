package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqden 645 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A042239 Denominators of continued fraction convergents to sqrt(645).
 * @author Georg Fischer
 */
public class A042239 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042239() {
    super(0, 645);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
