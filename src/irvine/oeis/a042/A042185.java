package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqden 617 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A042185 Denominators of continued fraction convergents to sqrt(617).
 * @author Georg Fischer
 */
public class A042185 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042185() {
    super(0, 617);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
