package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199931 Trisection 1 of <code>A199803</code>.
 * @author Sean A. Irvine
 */
public class A199931 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199931() {
    super(new long[] {-1, 1, -5, -1}, new long[] {-1, 2, 4, -15});
  }
}
