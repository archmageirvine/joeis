package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167498.
 * @author Sean A. Irvine
 */
public class A167498 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167498() {
    super(new long[] {-1, 4, -6, 4}, new long[] {6, 78, 342, 926});
  }
}
