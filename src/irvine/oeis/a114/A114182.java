package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114182.
 * @author Sean A. Irvine
 */
public class A114182 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114182() {
    super(new long[] {-1, 9, -16, 9}, new long[] {0, 16, 137, 978});
  }
}
