package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154708.
 * @author Sean A. Irvine
 */
public class A154708 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154708() {
    super(new long[] {-1, 1, 1}, new long[] {3, 4, 7});
  }
}
