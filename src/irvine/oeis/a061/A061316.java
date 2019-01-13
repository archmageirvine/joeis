package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061316.
 * @author Sean A. Irvine
 */
public class A061316 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061316() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 3, 15, 48, 120});
  }
}
