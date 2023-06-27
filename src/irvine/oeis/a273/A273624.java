package irvine.oeis.a273;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A273624 a(n) = (1/11)*(Fibonacci(4*n) + Fibonacci(6*n)).
 * @author Sean A. Irvine
 */
public class A273624 extends LinearRecurrence {

  /** Construct the sequence. */
  public A273624() {
    super(1, new long[] {-1, 25, -128, 25}, new long[] {1, 15, 248, 4305});
  }
}
