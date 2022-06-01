package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254029 Positive solutions of Monkey and Coconut Problem for the classic case (5 sailors, 1 coconut to the monkey): a(n) = 15625*n - 4 for n &gt;= 1.
 * @author Sean A. Irvine
 */
public class A254029 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254029() {
    super(new long[] {-1, 2}, new long[] {15621, 31246});
  }
}
