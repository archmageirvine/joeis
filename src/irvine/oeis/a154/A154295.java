package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154295.
 * @author Sean A. Irvine
 */
public class A154295 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154295() {
    super(new long[] {1, -3, 3}, new long[] {26, 17, 170});
  }
}
