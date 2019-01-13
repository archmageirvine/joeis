package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257450.
 * @author Sean A. Irvine
 */
public class A257450 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257450() {
    super(new long[] {-2, 11, -25, 30, -20, 7}, new long[] {1, 33, 277, 1335, 4771, 14193});
  }
}
