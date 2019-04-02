package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156085 One fourth of the sum of the squares of the first n Fibonacci numbers with index divisible by 3.
 * @author Sean A. Irvine
 */
public class A156085 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156085() {
    super(new long[] {-1, 17, 17}, new long[] {0, 1, 17});
  }
}
