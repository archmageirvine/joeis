package irvine.oeis.a066;

import irvine.oeis.FiniteSequence;

/**
 * A066458 Numbers n such that Sum_{d runs through digits of n} d^d = pi(n) (cf. A000720).
 * @author Georg Fischer
 */
public class A066458 extends FiniteSequence {

  /** Construct the sequence. */
  public A066458() {
    super(1, FINITE, 12, 22, 132, 34543, 612415, 27236725, 27236752, 311162281L, 311163138L, 327361548L, 9237866583L, 17499331217L, 17499551725L, 36475999489L, 36475999498L);
  }
}
