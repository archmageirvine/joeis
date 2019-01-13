package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083101.
 * @author Sean A. Irvine
 */
public class A083101 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083101() {
    super(new long[] {10, 2}, new long[] {1, 12});
  }
}
