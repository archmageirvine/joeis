package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158310 <code>361n + 1</code>.
 * @author Sean A. Irvine
 */
public class A158310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158310() {
    super(new long[] {-1, 2}, new long[] {362, 723});
  }
}
