package irvine.oeis.a194;

import irvine.oeis.LinearRecurrence;

/**
 * A194454 <code>a(n) = 12*n^2 + 2*n + 1</code>.
 * @author Sean A. Irvine
 */
public class A194454 extends LinearRecurrence {

  /** Construct the sequence. */
  public A194454() {
    super(new long[] {1, -3, 3}, new long[] {1, 15, 53});
  }
}
