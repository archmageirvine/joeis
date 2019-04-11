package irvine.oeis.a268;

import irvine.oeis.LinearRecurrence;

/**
 * A268413 <code>a(n) =</code> Sum_{k <code>= 0</code>..n} (-1)^k*14^k.
 * @author Sean A. Irvine
 */
public class A268413 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268413() {
    super(new long[] {14, -13}, new long[] {1, -13});
  }
}
