package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290471.
 * @author Sean A. Irvine
 */
public class A290471 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290471() {
    super(new long[] {1, 3, 4, 0, -5, -5, 1, 3, 1}, new long[] {1, 5, 7, 17, 31, 52, 99, 169, 301});
  }
}
