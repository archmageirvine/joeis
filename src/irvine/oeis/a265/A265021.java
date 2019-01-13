package irvine.oeis.a265;

import irvine.oeis.LinearRecurrence;

/**
 * A265021.
 * @author Sean A. Irvine
 */
public class A265021 extends LinearRecurrence {

  /** Construct the sequence. */
  public A265021() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 32, 1056, 8832, 41600, 141600, 390432});
  }
}
