package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqden 583 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A042117 Denominators of continued fraction convergents to sqrt(583).
 * @author Georg Fischer
 */
public class A042117 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042117() {
    super(0, 583);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
