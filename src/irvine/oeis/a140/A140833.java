package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140833 Sum of Fibonacci numbers between F(-n)....F(n), inclusive.
 * @author Sean A. Irvine
 */
public class A140833 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140833() {
    super(new long[] {-1, 0, 3, 0}, new long[] {0, 2, 2, 6});
  }
}
