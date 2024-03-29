package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqden 496 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A041947 Denominators of continued fraction convergents to sqrt(496).
 * @author Georg Fischer
 */
public class A041947 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041947() {
    super(0, 496);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
