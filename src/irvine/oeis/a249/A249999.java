package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249999.
 * @author Sean A. Irvine
 */
public class A249999 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249999() {
    super(new long[] {-6, 17, -17, 7}, new long[] {1, 7, 32, 122});
  }
}
