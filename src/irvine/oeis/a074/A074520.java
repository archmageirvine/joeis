package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074520.
 * @author Sean A. Irvine
 */
public class A074520 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074520() {
    super(new long[] {42, -55, 14}, new long[] {3, 14, 86});
  }
}
