package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167291.
 * @author Sean A. Irvine
 */
public class A167291 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167291() {
    super(new long[] {4, -4, 1}, new long[] {2, 2, 0});
  }
}
