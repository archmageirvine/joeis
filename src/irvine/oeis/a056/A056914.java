package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056914 <code>a(n) = L(4*n+1)</code> where <code>L()</code> are the Lucas numbers.
 * @author Sean A. Irvine
 */
public class A056914 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056914() {
    super(new long[] {-1, 7}, new long[] {1, 11});
  }
}
