package irvine.oeis.a097;
// Generated by gen_seq4.pl 2025-04-28.ack/polyx at 2025-04-28 23:36

import irvine.oeis.PolynomialFieldSequence;

/**
 * A097627 Number of rooted directed trees on n nodes with a red root.
 * Rest[CoefficientList[Series[LambertW[-LambertW[-2*x]/2], {x, 0, 20}], x]* Range[0, 20]!] (* _Vaclav Kotesovec_, Oct 08 2013 *)
 * @author Georg Fischer
 */
public class A097627 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A097627() {
    super(1, "[[1],[0,-2]]", ",p1,lambertW,neg, 2,/,lambertW", 0, 1);
  }
}
