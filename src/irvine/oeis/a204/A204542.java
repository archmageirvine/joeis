package irvine.oeis.a204;

import irvine.oeis.LinearRecurrence;

/**
 * A204542.
 * @author Sean A. Irvine
 */
public class A204542 extends LinearRecurrence {

  /** Construct the sequence. */
  public A204542() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 4, 11, 14, 16});
  }
}
