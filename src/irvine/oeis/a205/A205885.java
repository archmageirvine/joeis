package irvine.oeis.a205;
// Generated by gen_seq4.pl 2024-06-06/decexp at 2024-06-06 20:10

import irvine.oeis.a073.A073006;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A205885 Decimal expansion of the Fresnel Integral int_{x=0..infinity} x*cos(x^3) dx.
 * Formula:
 * @author Georg Fischer
 */
public class A205885 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A205885() {
    super(0, A073006.GAMMA_TWO_THIRDS.divide(6));
  }
}
