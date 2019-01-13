package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094825.
 * @author Sean A. Irvine
 */
public class A094825 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094825() {
    super(new long[] {-5, 20, -21, 8}, new long[] {1, 7, 35, 153});
  }
}
