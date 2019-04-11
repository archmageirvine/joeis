package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168398 <code>a(n) = 4 + 8*floor((n-1)/2)</code>.
 * @author Sean A. Irvine
 */
public class A168398 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168398() {
    super(new long[] {-1, 1, 1}, new long[] {4, 4, 12});
  }
}
