package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176513.
 * @author Sean A. Irvine
 */
public class A176513 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176513() {
    super(new long[] {1, 0, 1, 1, 0}, new long[] {1, 1, 1, 1, 1});
  }
}
