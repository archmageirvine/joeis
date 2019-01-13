package irvine.oeis.a250;

import irvine.oeis.LinearRecurrence;

/**
 * A250101.
 * @author Sean A. Irvine
 */
public class A250101 extends LinearRecurrence {

  /** Construct the sequence. */
  public A250101() {
    super(new long[] {150, 11, 0}, new long[] {0, 18, 86});
  }
}
