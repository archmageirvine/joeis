package irvine.oeis.a014;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A014447 Odd Lucas numbers.
 * @author Sean A. Irvine
 */
public class A014447 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014447() {
    super(new long[] {1, 0, 4, 0}, new long[] {1, 3, 7, 11});
  }
}

