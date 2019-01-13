package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026063.
 * @author Sean A. Irvine
 */
public class A026063 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026063() {
    super(new long[] {-1, 4, -6, 4}, new long[] {71, 119, 180, 255});
  }
}
