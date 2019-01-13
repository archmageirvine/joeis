package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098992.
 * @author Sean A. Irvine
 */
public class A098992 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098992() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 0, 1, 11, 55, 190, 526, 1254});
  }
}
