package irvine.oeis.a030;

import irvine.oeis.LinearRecurrence;

/**
 * A030442.
 * @author Sean A. Irvine
 */
public class A030442 extends LinearRecurrence {

  /** Construct the sequence. */
  public A030442() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {163, 57, 16, 4, 1});
  }
}
