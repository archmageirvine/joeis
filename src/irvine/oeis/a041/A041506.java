package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041506 Numerators of continued fraction convergents to sqrt(270).
 * @author Sean A. Irvine
 */
public class A041506 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041506() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 10582, 0, 0, 0, 0, 0}, new long[] {16, 33, 115, 723, 2284, 5291, 171596, 348483, 1217045, 7650753, 24169304, 55989361});
  }
}
