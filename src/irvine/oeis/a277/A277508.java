package irvine.oeis.a277;
// Generated by gen_seq4.pl 2025-04-28.ack/polyx at 2025-04-28 23:36

import irvine.oeis.PolynomialFieldSequence;

/**
 * A277508 E.g.f.: -1/((1-LambertW(-x))*(1+x)).
 * E.g.f.: -1/((1-LambertW(-x))*(1+x)).
 * @author Georg Fischer
 */
public class A277508 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A277508() {
    super(0, "[[1],[0,-1],[1, 1]]", ", 1,neg, 1,p1,lambertW,-,p2,*,/", 0, 1);
  }
}
