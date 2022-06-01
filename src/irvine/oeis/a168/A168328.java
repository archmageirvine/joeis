package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168328 a(n) = 6 * floor( n/2 ).
 * @author Sean A. Irvine
 */
public class A168328 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168328() {
    super(new long[] {-1, 1, 1}, new long[] {0, 6, 6});
  }
}
