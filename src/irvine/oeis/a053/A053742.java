package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053742 Sum of odd numbers in range <code>10*n</code> to <code>10*n+9</code>.
 * @author Sean A. Irvine
 */
public class A053742 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053742() {
    super(new long[] {-1, 2}, new long[] {25, 75});
  }
}
