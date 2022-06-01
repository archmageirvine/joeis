package irvine.oeis.a049;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A049679 a(n) = (F(8*n+7)+F(8*n+5))/3, where F=A000045 (the Fibonacci sequence).
 * @author Sean A. Irvine
 */
public class A049679 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049679() {
    super(new long[] {-1, 47}, new long[] {6, 281});
  }
}
