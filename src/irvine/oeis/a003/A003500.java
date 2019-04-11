package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003500 <code>a(n) = 4*a(n-1) - a(n-2)</code> with <code>a(0) = 2, a(1) = 4</code>.
 * @author Sean A. Irvine
 */
public class A003500 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003500() {
    super(new long[] {-1, 4}, new long[] {2, 4});
  }
}

