package irvine.oeis.a103;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A103326 a(n) = Fibonacci(5n)/Fibonacci(n).
 * @author Sean A. Irvine
 */
public class A103326 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103326() {
    super(new long[] {1, -5, -15, 15, 5}, new long[] {5, 55, 305, 2255, 15005});
  }
}
