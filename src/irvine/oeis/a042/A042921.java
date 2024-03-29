package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqden 992 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A042921 Denominators of continued fraction convergents to sqrt(992).
 * @author Georg Fischer
 */
public class A042921 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042921() {
    super(0, 992);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
