package irvine.oeis.a146;

import irvine.oeis.LinearRecurrence;

/**
 * A146302.
 * @author Sean A. Irvine
 */
public class A146302 extends LinearRecurrence {

  /** Construct the sequence. */
  public A146302() {
    super(new long[] {1, -3, 3}, new long[] {45, 221, 525});
  }
}
