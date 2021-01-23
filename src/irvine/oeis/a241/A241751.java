package irvine.oeis.a241;

import irvine.oeis.LinearRecurrence;

/**
 * A241751 a(n) = n^2 + 16.
 * @author Sean A. Irvine
 */
public class A241751 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241751() {
    super(new long[] {1, -3, 3}, new long[] {16, 17, 20});
  }
}
