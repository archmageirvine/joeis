package irvine.oeis.a220;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A220236 Binary palindromic numbers with only two 0 bits, both in the middle.
 * @author Sean A. Irvine
 */
public class A220236 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220236() {
    super(new long[] {8, -14, 7}, new long[] {9, 51, 231});
  }
}
