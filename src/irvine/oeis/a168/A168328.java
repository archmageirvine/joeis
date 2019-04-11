package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168328 <code>a(n) = 6 * floor( n/2 )</code>.
 * @author Sean A. Irvine
 */
public class A168328 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168328() {
    super(new long[] {-1, 1, 1}, new long[] {0, 6, 6});
  }
}
