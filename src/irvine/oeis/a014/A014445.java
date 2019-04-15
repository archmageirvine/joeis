package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014445 Even Fibonacci numbers; or, <code>Fibonacci(3*n)</code>.
 * @author Sean A. Irvine
 */
public class A014445 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014445() {
    super(new long[] {1, 4}, new long[] {0, 2});
  }
}

