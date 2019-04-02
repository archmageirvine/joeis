package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120571 2n^4+6n^2+4 = 2(n^2+1)(n^2+2).
 * @author Sean A. Irvine
 */
public class A120571 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120571() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {12, 60, 220, 612, 1404});
  }
}
