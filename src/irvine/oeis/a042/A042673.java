package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqden 866 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A042673 Denominators of continued fraction convergents to sqrt(866).
 * @author Georg Fischer
 */
public class A042673 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042673() {
    super(0, 866);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
