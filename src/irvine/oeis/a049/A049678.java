package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049678 a(n) = F(8*n+4)/3, where F=A000045 (the Fibonacci sequence).
 * @author Sean A. Irvine
 */
public class A049678 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049678() {
    super(new long[] {-1, 47}, new long[] {1, 48});
  }
}
