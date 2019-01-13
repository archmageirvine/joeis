package irvine.oeis.a280;

import irvine.oeis.LinearRecurrence;

/**
 * A280757.
 * @author Sean A. Irvine
 */
public class A280757 extends LinearRecurrence {

  /** Construct the sequence. */
  public A280757() {
    super(new long[] {-1, 1, 4, 0}, new long[] {0, 2, 1, 8});
  }
}
