package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqden 898 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A042737 Denominators of continued fraction convergents to sqrt(898).
 * @author Georg Fischer
 */
public class A042737 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042737() {
    super(0, 898);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
