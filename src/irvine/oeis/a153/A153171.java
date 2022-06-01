package irvine.oeis.a153;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A153171 First differences of A046163.
 * @author Sean A. Irvine
 */
public class A153171 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153171() {
    super(new long[] {-1, -1, -1, 2, 2, 2, -1, -1}, new long[] {6, 6, -6, 24, 12, -24, 54, 18});
  }
}
