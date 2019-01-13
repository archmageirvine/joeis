package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047212.
 * @author Sean A. Irvine
 */
public class A047212 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047212() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 2, 4, 5});
  }
}
