package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015221.
 * @author Sean A. Irvine
 */
public class A015221 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015221() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 5, 55, 91, 285, 385, 819});
  }
}
