package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqden 149 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A041273 Denominators of continued fraction convergents to sqrt(149).
 * @author Georg Fischer
 */
public class A041273 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041273() {
    super(0, 149);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
