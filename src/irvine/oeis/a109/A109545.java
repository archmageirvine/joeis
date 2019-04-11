package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109545 <code>a(n) = 2*a(n-1) + a(n-2) + a(n-3)</code>.
 * @author Sean A. Irvine
 */
public class A109545 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109545() {
    super(new long[] {1, 1, 2}, new long[] {1, 1, 2});
  }
}
