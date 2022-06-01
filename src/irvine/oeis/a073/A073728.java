package irvine.oeis.a073;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A073728 a(n) = Sum_{k=0..n} S(k), where S(n) are the tribonacci generalized numbers A001644.
 * @author Sean A. Irvine
 */
public class A073728 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073728() {
    super(new long[] {1, 1, 1}, new long[] {3, 4, 7});
  }
}
