package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048478 a(n) = T(6,n), array T given by A048472.
 * @author Sean A. Irvine
 */
public class A048478 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048478() {
    super(new long[] {4, -8, 5}, new long[] {1, 8, 29});
  }
}
