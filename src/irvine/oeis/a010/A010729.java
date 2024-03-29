package irvine.oeis.a010;

import irvine.oeis.recur.PeriodicSequence;

/**
 * A010729 a(n) = 8 - (-1)^n.
 * @author Sean A. Irvine
 */
public class A010729 extends PeriodicSequence {

  /** Construct the sequence. */
  public A010729() {
    super(7, 9);
  }
}
