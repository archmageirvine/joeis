package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083315.
 * @author Sean A. Irvine
 */
public class A083315 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083315() {
    super(new long[] {40, -38, 11}, new long[] {1, 4, 19});
  }
}
