package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129428 Centered 47-gonal numbers.
 * @author Sean A. Irvine
 */
public class A129428 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129428() {
    super(new long[] {1, -3, 3}, new long[] {1, 48, 142});
  }
}
