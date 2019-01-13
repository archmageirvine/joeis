package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123950.
 * @author Sean A. Irvine
 */
public class A123950 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123950() {
    super(new long[] {-2, 3, 3}, new long[] {0, 1, 1});
  }
}
