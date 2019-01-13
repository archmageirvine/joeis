package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028120.
 * @author Sean A. Irvine
 */
public class A028120 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028120() {
    super(new long[] {-1440, 988, -245, 26}, new long[] {1, 26, 431, 5824});
  }
}
