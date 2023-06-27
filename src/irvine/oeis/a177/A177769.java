package irvine.oeis.a177;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A177769 a(n) = 111*n.
 * @author Sean A. Irvine
 */
public class A177769 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177769() {
    super(1, new long[] {-1, 2}, new long[] {111, 222});
  }
}
