package irvine.oeis.a089;
// manually mult at 2022-07-21 09:02

import irvine.oeis.recur.PeriodicSequence;

/**
 * A089146 Greatest common divisor of n^2 - 4 and n^2 + 4.
 * @author Georg Fischer
 */
public class A089146 extends PeriodicSequence {

  /** Construct the sequence. */
  public A089146() {
    super(4, 1, 8, 1);
  }
}
