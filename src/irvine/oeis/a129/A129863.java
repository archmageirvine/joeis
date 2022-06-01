package irvine.oeis.a129;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A129863 Sums of three consecutive pentagonal numbers.
 * @author Sean A. Irvine
 */
public class A129863 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129863() {
    super(new long[] {1, -3, 3}, new long[] {6, 18, 39});
  }
}
