package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157110.
 * @author Sean A. Irvine
 */
public class A157110 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157110() {
    super(new long[] {1, -3, 3}, new long[] {85, 2522, 8321});
  }
}
