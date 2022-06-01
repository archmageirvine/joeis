package irvine.oeis.a165;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A165717 Integers of the form k*(5+k)/4.
 * @author Sean A. Irvine
 */
public class A165717 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165717() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {6, 9, 21, 26, 44});
  }
}
