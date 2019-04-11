package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097080 <code>a(n) = 2*n^2 - 2*n + 3</code>.
 * @author Sean A. Irvine
 */
public class A097080 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097080() {
    super(new long[] {1, -3, 3}, new long[] {3, 7, 15});
  }
}
