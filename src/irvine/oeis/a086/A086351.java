package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086351.
 * @author Sean A. Irvine
 */
public class A086351 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086351() {
    super(new long[] {-7, 6}, new long[] {1, 4});
  }
}
