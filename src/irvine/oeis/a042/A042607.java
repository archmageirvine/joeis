package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqden 832 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A042607 Denominators of continued fraction convergents to sqrt(832).
 * @author Georg Fischer
 */
public class A042607 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042607() {
    super(0, 832);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
