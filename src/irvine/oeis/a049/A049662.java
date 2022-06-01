package irvine.oeis.a049;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A049662 a(n) = (F(6*n+2)-1)/4, where F=A000045 (the Fibonacci sequence).
 * @author Sean A. Irvine
 */
public class A049662 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049662() {
    super(new long[] {1, -19, 19}, new long[] {0, 5, 94});
  }
}
