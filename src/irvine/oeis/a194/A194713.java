package irvine.oeis.a194;

import irvine.oeis.LinearRecurrence;

/**
 * A194713.
 * @author Sean A. Irvine
 */
public class A194713 extends LinearRecurrence {

  /** Construct the sequence. */
  public A194713() {
    super(new long[] {1, -3, 3}, new long[] {0, 13, 78});
  }
}
