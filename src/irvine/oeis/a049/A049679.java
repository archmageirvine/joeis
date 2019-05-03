package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049679 <code>a(n) = (F(8*n+7)+F(8*n+5))/3</code>, where <code>F=A000045 (the</code> Fibonacci sequence).
 * @author Sean A. Irvine
 */
public class A049679 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049679() {
    super(new long[] {-1, 47}, new long[] {6, 281});
  }
}
