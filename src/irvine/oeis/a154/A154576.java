package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154576.
 * @author Sean A. Irvine
 */
public class A154576 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154576() {
    super(new long[] {1, -3, 3}, new long[] {21, 41, 65});
  }
}
