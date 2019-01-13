package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130875.
 * @author Sean A. Irvine
 */
public class A130875 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130875() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 7, 1, 3, 1, 1, 3, 1, 7, 9});
  }
}
