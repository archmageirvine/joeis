package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003480 <code>a(n) = 4a(n-1) - 2a(n-2) (n &gt;= 3)</code>.
 * @author Sean A. Irvine
 */
public class A003480 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003480() {
    super(new long[] {0, -2, 4}, new long[] {1, 2, 7});
  }
}

