package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178635.
 * @author Sean A. Irvine
 */
public class A178635 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178635() {
    super(new long[] {1000, -1110, 111}, new long[] {72, 8712, 887112});
  }
}
