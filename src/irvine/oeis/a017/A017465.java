package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017465 <code>a(n) = (11*n + 6)^5</code>.
 * @author Sean A. Irvine
 */
public class A017465 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017465() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {7776, 1419857, 17210368, 90224199, 312500000, 844596301});
  }
}
