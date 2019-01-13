package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167826.
 * @author Sean A. Irvine
 */
public class A167826 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167826() {
    super(new long[] {2, 3, 0, -3, -3, 4}, new long[] {0, 0, 0, 0, 0, 2});
  }
}
