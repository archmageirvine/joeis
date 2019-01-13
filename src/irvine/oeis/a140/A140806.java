package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140806.
 * @author Sean A. Irvine
 */
public class A140806 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140806() {
    super(new long[] {-1, 0, 0, 0, -14, 0, 0, 0}, new long[] {1, 1, 1, 1, 1, 1, 1, 1});
  }
}
