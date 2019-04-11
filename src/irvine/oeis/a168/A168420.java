package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168420 <code>a(n) = 4 + 10*floor(n/2)</code>.
 * @author Sean A. Irvine
 */
public class A168420 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168420() {
    super(new long[] {-1, 1, 1}, new long[] {4, 14, 14});
  }
}
