package irvine.oeis.a053;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A053742 Sum of odd numbers in range 10*n to 10*n+9.
 * @author Sean A. Irvine
 */
public class A053742 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053742() {
    super(new long[] {-1, 2}, new long[] {25, 75});
  }
}
