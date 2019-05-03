package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053422 n times <code>(n 1's): a(n) = n*(10^n - 1)/9</code>.
 * @author Sean A. Irvine
 */
public class A053422 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053422() {
    super(new long[] {-100, 220, -141, 22}, new long[] {0, 1, 22, 333});
  }
}
