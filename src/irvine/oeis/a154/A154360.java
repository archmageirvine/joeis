package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154360.
 * @author Sean A. Irvine
 */
public class A154360 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154360() {
    super(new long[] {-1, 2}, new long[] {-180, 70});
  }
}
