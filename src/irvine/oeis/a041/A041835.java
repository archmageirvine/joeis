package irvine.oeis.a041;
// Generated by gen_seq4.pl cfsqden 438 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A041835 Denominators of continued fraction convergents to sqrt(438).
 * @author Georg Fischer
 */
public class A041835 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A041835() {
    super(0, 438);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
