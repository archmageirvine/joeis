package irvine.oeis.a238;

import irvine.oeis.LinearRecurrence;

/**
 * A238539 A fourth-order linear divisibility sequence: <code>a(n) </code>:= <code>1/9*(2^n + (-1)^n)*(2^(3*n) - (-1)^n)</code>.
 * @author Sean A. Irvine
 */
public class A238539 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238539() {
    super(new long[] {-256, 112, 138, 7}, new long[] {1, 35, 399, 7735});
  }
}
