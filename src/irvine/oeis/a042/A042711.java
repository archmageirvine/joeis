package irvine.oeis.a042;
// Generated by gen_seq4.pl cfsqden 885 at 2019-07-04 10:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A042711 Denominators of continued fraction convergents to sqrt(885).
 * @author Georg Fischer
 */
public class A042711 extends ContinuedFractionOfSqrtSequence {

  /** Construct the sequence. */
  public A042711() {
    super(0, 885);
  }
  
  @Override
  public Z next() {
    final Z result = getDenominator(); 
    iterate();
    iterateConvergents();
    return result;
  }
}
