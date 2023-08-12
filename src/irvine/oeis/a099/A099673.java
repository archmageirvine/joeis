package irvine.oeis.a099;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A099673 Partial sums of repdigits of A002280.
 * @author Georg Fischer
 */
public class A099673 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A099673() {
    super(1, "[0,10,-21,12,-1]", "6", 0);
  }
}
