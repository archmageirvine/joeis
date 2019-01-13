package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178632.
 * @author Sean A. Irvine
 */
public class A178632 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178632() {
    super(new long[] {1000, -1110, 111}, new long[] {45, 5445, 554445});
  }
}
