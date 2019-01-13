package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120328.
 * @author Sean A. Irvine
 */
public class A120328 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120328() {
    super(new long[] {1, -3, 3}, new long[] {2, 5, 14});
  }
}
