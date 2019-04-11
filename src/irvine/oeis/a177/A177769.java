package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177769 <code>a(n) = 111*n</code>.
 * @author Sean A. Irvine
 */
public class A177769 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177769() {
    super(new long[] {-1, 2}, new long[] {111, 222});
  }
}
