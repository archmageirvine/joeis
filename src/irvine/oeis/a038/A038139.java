package irvine.oeis.a038;

import irvine.oeis.recur.PeriodicSequence;

/**
 * A038139 Order of n (mod 9).
 * @author Sean A. Irvine
 */
public class A038139 extends PeriodicSequence {

  /** Construct the sequence. */
  public A038139() {
    super(1, 6, 0, 3, 6, 0, 3, 2, 0);
    setOffset(1);
  }
}
