package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192849.
 * @author Sean A. Irvine
 */
public class A192849 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192849() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 0, 24, 240, 1080, 3360});
  }
}
