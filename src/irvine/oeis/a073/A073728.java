package irvine.oeis.a073;

import irvine.oeis.LinearRecurrence;

/**
 * A073728 <code>a(n) = Sum_{k=0..n} S(k)</code>, where <code>S(n)</code> are the tribonacci generalized numbers <code>A001644</code>.
 * @author Sean A. Irvine
 */
public class A073728 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073728() {
    super(new long[] {1, 1, 1}, new long[] {3, 4, 7});
  }
}
