package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100314 Number of 2 X <code>n 0-1</code> matrices avoiding simultaneously the right angled numbered polyomino patterns (ranpp) <code>(00</code>;1), <code>(01</code>;0), <code>(10</code>;0) and <code>(01</code>;1).
 * @author Sean A. Irvine
 */
public class A100314 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100314() {
    super(new long[] {2, -5, 4}, new long[] {1, 4, 8});
  }
}
