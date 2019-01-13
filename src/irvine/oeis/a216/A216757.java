package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216757.
 * @author Sean A. Irvine
 */
public class A216757 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216757() {
    super(new long[] {3, -9, 6}, new long[] {0, -3, -15});
  }
}
