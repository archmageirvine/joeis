package irvine.oeis.a281;

import irvine.oeis.LinearRecurrence;

/**
 * A281698.
 * @author Sean A. Irvine
 */
public class A281698 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281698() {
    super(new long[] {-48, 92, -56, 13}, new long[] {5, 14, 55, 269});
  }
}
