package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168401 <code>4 + 9*floor(n/2)</code>.
 * @author Sean A. Irvine
 */
public class A168401 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168401() {
    super(new long[] {-1, 1, 1}, new long[] {4, 13, 13});
  }
}
