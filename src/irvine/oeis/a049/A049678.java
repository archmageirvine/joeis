package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049678 <code>a(n) = F(8*n+4)/3</code>, where <code>F=A000045 (the</code> Fibonacci sequence).
 * @author Sean A. Irvine
 */
public class A049678 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049678() {
    super(new long[] {-1, 47}, new long[] {1, 48});
  }
}
