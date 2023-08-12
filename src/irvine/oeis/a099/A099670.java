package irvine.oeis.a099;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A099670 Partial sums of repdigits of A002277.
 * @author Georg Fischer
 */
public class A099670 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A099670() {
    super(1, "[0,10,-21,12,-1]", "3", 0);
  }
}
