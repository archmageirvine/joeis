package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214493 Numbers of the form ((6k+5)^2+9)/2 or 2(3k+4)^2-9.
 * @author Sean A. Irvine
 */
public class A214493 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214493() {
    super(new long[] {1, -2, 0, 2}, new long[] {17, 23, 65, 89});
  }
}
