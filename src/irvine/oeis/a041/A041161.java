package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqden 90 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A041161 Denominators of continued fraction convergents to sqrt(90).
 * @author Georg Fischer
 */
public class A041161 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041161() {
    super(0, 90);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
