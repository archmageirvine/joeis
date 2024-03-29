package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqden 991 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A042919 Denominators of continued fraction convergents to sqrt(991).
 * @author Georg Fischer
 */
public class A042919 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042919() {
    super(0, 991);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
