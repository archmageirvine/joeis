package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199026 7*11^n-1.
 * @author Sean A. Irvine
 */
public class A199026 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199026() {
    super(new long[] {-11, 12}, new long[] {6, 76});
  }
}
