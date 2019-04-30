package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276764 <code>1^2 + 3^2, 2^2 + 4^2, 5^2 + 7^2, 6^2 + 8^2, </code>...
 * @author Sean A. Irvine
 */
public class A276764 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276764() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {10, 20, 74, 100, 202});
  }
}
