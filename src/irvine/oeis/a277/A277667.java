package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277667 Number of n-length words over a quaternary alphabet <code>{a_1,a_2,...,a_4}</code> avoiding consecutive letters <code>a_i, a_{i+1}</code>.
 * @author Sean A. Irvine
 */
public class A277667 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277667() {
    super(new long[] {-1, 2, -3, 4}, new long[] {1, 4, 13, 42});
  }
}
