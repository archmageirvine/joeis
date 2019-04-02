package irvine.oeis.a222;

import irvine.oeis.LinearRecurrence;

/**
 * A222258 Lexicographically earliest injective sequence of nonnegative integers such that the sum of 8 consecutive terms is always divisible by 8.
 * @author Sean A. Irvine
 */
public class A222258 extends LinearRecurrence {

  /** Construct the sequence. */
  public A222258() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {0, 1, 2, 3, 4, 5, 6, 11});
  }
}
