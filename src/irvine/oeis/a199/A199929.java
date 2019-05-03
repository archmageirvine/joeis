package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199929 Trisection 2 of <code>A199802</code>.
 * @author Sean A. Irvine
 */
public class A199929 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199929() {
    super(new long[] {-1, 1, -5, -1}, new long[] {2, -4, -5, 27});
  }
}
