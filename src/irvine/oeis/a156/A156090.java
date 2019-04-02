package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156090 Alternating sum of the squares of the first n Fibonacci numbers with index divisible by 3.
 * @author Sean A. Irvine
 */
public class A156090 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156090() {
    super(new long[] {-1, -16, 34, -16}, new long[] {0, -4, 60, -1096});
  }
}
