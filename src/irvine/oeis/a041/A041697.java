package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqden 368 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A041697 Denominators of continued fraction convergents to sqrt(368).
 * @author Georg Fischer
 */
public class A041697 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041697() {
    super(0, 368);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
