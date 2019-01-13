package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124133.
 * @author Sean A. Irvine
 */
public class A124133 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124133() {
    super(new long[] {4, -9, 6}, new long[] {0, 5, 28});
  }
}
