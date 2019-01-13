package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078049.
 * @author Sean A. Irvine
 */
public class A078049 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078049() {
    super(new long[] {1, -2, -1}, new long[] {1, -2, 0});
  }
}
