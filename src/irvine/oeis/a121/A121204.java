package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121204 -2n+7^n-5^n.
 * @author Sean A. Irvine
 */
public class A121204 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121204() {
    super(new long[] {-35, 82, -60, 14}, new long[] {0, 0, 20, 212});
  }
}
