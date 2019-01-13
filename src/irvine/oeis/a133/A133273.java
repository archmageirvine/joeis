package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133273.
 * @author Sean A. Irvine
 */
public class A133273 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133273() {
    super(new long[] {1, -19, 19}, new long[] {1, 10, 171});
  }
}
