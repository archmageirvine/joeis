package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqden 855 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A042651 Denominators of continued fraction convergents to sqrt(855).
 * @author Georg Fischer
 */
public class A042651 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042651() {
    super(0, 855);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
