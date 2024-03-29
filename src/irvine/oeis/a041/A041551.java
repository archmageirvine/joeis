package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqden 293 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A041551 Denominators of continued fraction convergents to sqrt(293).
 * @author Georg Fischer
 */
public class A041551 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041551() {
    super(0, 293);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
