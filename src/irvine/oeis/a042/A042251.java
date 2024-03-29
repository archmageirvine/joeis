package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqden 651 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A042251 Denominators of continued fraction convergents to sqrt(651).
 * @author Georg Fischer
 */
public class A042251 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042251() {
    super(0, 651);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
