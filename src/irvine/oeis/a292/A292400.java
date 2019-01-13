package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292400.
 * @author Sean A. Irvine
 */
public class A292400 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292400() {
    super(new long[] {-1, -4, -2, 4}, new long[] {2, 7, 20, 57});
  }
}
