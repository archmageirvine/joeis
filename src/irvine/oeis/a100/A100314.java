package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100314 Number of <code>2 X n 0-1</code> matrices avoiding simultaneously the right angled numbered polyomino patterns (ranpp) <code>(00;1), (01;0), (10;0)</code> and <code>(01;1)</code>.
 * @author Sean A. Irvine
 */
public class A100314 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100314() {
    super(new long[] {2, -5, 4}, new long[] {1, 4, 8});
  }
}
