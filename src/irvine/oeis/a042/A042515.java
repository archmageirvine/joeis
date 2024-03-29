package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqden 786 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A042515 Denominators of continued fraction convergents to sqrt(786).
 * @author Georg Fischer
 */
public class A042515 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042515() {
    super(0, 786);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
