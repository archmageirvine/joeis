package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290027.
 * @author Sean A. Irvine
 */
public class A290027 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290027() {
    super(new long[] {32, -80, 80, -40, 10}, new long[] {0, 0, 3, 102, 900});
  }
}
