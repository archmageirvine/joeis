package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154627.
 * @author Sean A. Irvine
 */
public class A154627 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154627() {
    super(new long[] {-4, 8}, new long[] {1, 3});
  }
}
