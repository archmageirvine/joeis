package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083216 Fibonacci-like sequence of composite numbers with a(0) = 20615674205555510, a(1) = 3794765361567513.
 * @author Sean A. Irvine
 */
public class A083216 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083216() {
    super(new long[] {1, 1}, new long[] {20615674205555510L, 3794765361567513L});
  }
}
