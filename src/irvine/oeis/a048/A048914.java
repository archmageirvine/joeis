package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048914.
 * @author Sean A. Irvine
 */
public class A048914 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048914() {
    super(new long[] {1, -1, -12098, 12098, 1}, new long[] {1, 21, 10981, 252081, 132846121});
  }
}
