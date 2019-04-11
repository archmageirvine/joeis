package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168321 <code>a(n) = n - a(n-1),</code> with <code>a(0) = 7</code>.
 * @author Sean A. Irvine
 */
public class A168321 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168321() {
    super(new long[] {-1, 1, 1}, new long[] {0, 8, 1});
  }
}
