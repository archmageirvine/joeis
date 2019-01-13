package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159758.
 * @author Sean A. Irvine
 */
public class A159758 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159758() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {65, 79, 101, 289, 395, 541});
  }
}
