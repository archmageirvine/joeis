package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049665 <code>a(n) = (F(6*n+4) - 3)/4</code>, where F=A000045 (the Fibonacci sequence).
 * @author Sean A. Irvine
 */
public class A049665 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049665() {
    super(new long[] {1, -19, 19}, new long[] {0, 13, 246});
  }
}
