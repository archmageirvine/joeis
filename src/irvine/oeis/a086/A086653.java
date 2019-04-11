package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086653 <code>2^n + 3*n</code>.
 * @author Sean A. Irvine
 */
public class A086653 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086653() {
    super(new long[] {2, -5, 4}, new long[] {5, 10, 17});
  }
}
