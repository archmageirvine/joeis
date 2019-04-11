package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187709 <code>a(n) = (7*9^n + 1)/8</code>.
 * @author Sean A. Irvine
 */
public class A187709 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187709() {
    super(new long[] {-9, 10}, new long[] {1, 8});
  }
}
