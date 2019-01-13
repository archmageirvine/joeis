package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154515.
 * @author Sean A. Irvine
 */
public class A154515 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154515() {
    super(new long[] {1, -3, 3}, new long[] {721, 2737, 6049});
  }
}
