package irvine.oeis.a085;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A085613 a(n) = 2^(n-1) + (2 + (-1)^n)^((n-2)/2).
 * @author Sean A. Irvine
 */
public class A085613 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085613() {
    super(new long[] {6, -3, -8, 4, 2}, new long[] {2, 3, 5, 11, 17});
  }
}
