package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072465 A Fibonacci-like model in which each pair of rabbits dies after the birth of their 4th litter: a(n) = a(n-2) + a(n-3) + a(n-4) + a(n-5).
 * @author Sean A. Irvine
 */
public class A072465 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072465() {
    super(new long[] {1, 1, 1, 1, 0}, new long[] {1, 1, 1, 2, 3});
  }
}
