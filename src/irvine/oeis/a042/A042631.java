package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqden 845 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A042631 Denominators of continued fraction convergents to sqrt(845).
 * @author Georg Fischer
 */
public class A042631 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042631() {
    super(0, 845);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
