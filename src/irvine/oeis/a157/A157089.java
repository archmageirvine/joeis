package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157089.
 * @author Sean A. Irvine
 */
public class A157089 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157089() {
    super(new long[] {1, -15, 15}, new long[] {3, 27, 363});
  }
}
