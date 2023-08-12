package irvine.oeis.a099;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A099674 Partial sums of repdigits of A002281.
 * @author Georg Fischer
 */
public class A099674 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A099674() {
    super(1, "[0,10,-21,12,-1]", "7", 0);
  }
}
