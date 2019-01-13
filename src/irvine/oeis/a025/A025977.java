package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025977.
 * @author Sean A. Irvine
 */
public class A025977 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025977() {
    super(new long[] {-640, 624, -196, 24}, new long[] {1, 24, 380, 5040});
  }
}
