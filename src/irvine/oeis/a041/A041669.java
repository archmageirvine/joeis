package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqden 353 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A041669 Denominators of continued fraction convergents to sqrt(353).
 * @author Georg Fischer
 */
public class A041669 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041669() {
    super(0, 353);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
