package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155098.
 * @author Sean A. Irvine
 */
public class A155098 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155098() {
    super(new long[] {-1, 1, 1}, new long[] {9, 32, 50});
  }
}
