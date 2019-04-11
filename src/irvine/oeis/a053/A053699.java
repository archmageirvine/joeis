package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053699 <code>a(n) = n^4 + n^3 + n^2 + n + 1</code>.
 * @author Sean A. Irvine
 */
public class A053699 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053699() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 5, 31, 121, 341});
  }
}
