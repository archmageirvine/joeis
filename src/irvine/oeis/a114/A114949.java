package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114949 <code>a(n) = n^2 + 6</code>.
 * @author Sean A. Irvine
 */
public class A114949 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114949() {
    super(new long[] {1, -3, 3}, new long[] {6, 7, 10});
  }
}
