package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176691.
 * @author Sean A. Irvine
 */
public class A176691 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176691() {
    super(new long[] {2, -5, 4}, new long[] {2, 5, 9});
  }
}
