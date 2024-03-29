package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqden 923 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A042785 Denominators of continued fraction convergents to sqrt(923).
 * @author Georg Fischer
 */
public class A042785 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042785() {
    super(0, 923);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
