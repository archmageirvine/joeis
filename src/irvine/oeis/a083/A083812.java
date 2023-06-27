package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083812 4n-1 is the digit reversal of n-1.
 * @author Sean A. Irvine
 */
public class A083812 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083812() {
    super(1, new long[] {-10, 11}, new long[] {18, 198});
  }
}
