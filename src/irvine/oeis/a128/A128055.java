package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128055 <code>a(n)=2^A128054(n)</code>.
 * @author Sean A. Irvine
 */
public class A128055 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128055() {
    super(new long[] {32, -16, 8, -4, 2}, new long[] {1, 1, 2, 4, 8});
  }
}
