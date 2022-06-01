package irvine.oeis.a014;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A014445 Even Fibonacci numbers; or, Fibonacci(3*n).
 * @author Sean A. Irvine
 */
public class A014445 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014445() {
    super(new long[] {1, 4}, new long[] {0, 2});
  }
}

