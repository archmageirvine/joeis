package irvine.oeis.a049;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A049656 a(n) = (F(8n+7)-1)/3, where F=A000045 (the Fibonacci sequence).
 * @author Sean A. Irvine
 */
public class A049656 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049656() {
    super(new long[] {1, -48, 48}, new long[] {4, 203, 9552});
  }
}
