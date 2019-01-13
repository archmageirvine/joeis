package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254527.
 * @author Sean A. Irvine
 */
public class A254527 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254527() {
    super(new long[] {1, -3, 3}, new long[] {6, 26, 62});
  }
}
