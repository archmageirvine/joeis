package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173952 <code>a(1)=32</code> and, for <code>n &gt; 1, a(n) = 9*a(n-1) + 32</code>.
 * @author Sean A. Irvine
 */
public class A173952 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173952() {
    super(new long[] {-9, 10}, new long[] {32, 320});
  }
}
