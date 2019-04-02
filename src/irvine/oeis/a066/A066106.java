package irvine.oeis.a066;

import irvine.oeis.LinearRecurrence;

/**
 * A066106 a(2n) = (2n)(2n+2); a(2n+1) = 4n + 4.
 * @author Sean A. Irvine
 */
public class A066106 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066106() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {0, 4, 8, 8, 24, 12});
  }
}
