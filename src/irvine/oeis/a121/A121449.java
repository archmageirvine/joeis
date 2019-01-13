package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121449.
 * @author Sean A. Irvine
 */
public class A121449 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121449() {
    super(new long[] {-1, -3, 4}, new long[] {1, 1, 3});
  }
}
