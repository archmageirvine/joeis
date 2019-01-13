package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047252.
 * @author Sean A. Irvine
 */
public class A047252 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047252() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 1, 3, 4, 5, 6});
  }
}
