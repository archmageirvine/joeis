package irvine.oeis.a277;
// Generated by gen_seq4.pl 2025-04-28.ack/polyx at 2025-04-28 23:36

import irvine.oeis.PolynomialFieldSequence;

/**
 * A277470 E.g.f.: arcsinh(x)/(1+LambertW(-x)).
 * E.g.f.: arcsinh(x)/(1+LambertW(-x)).
 * @author Georg Fischer
 */
public class A277470 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A277470() {
    super(0, "[[1],[0,-1]]", ",x,asinh, 1,p1,lambertW,+,/", 0, 1);
  }
}
