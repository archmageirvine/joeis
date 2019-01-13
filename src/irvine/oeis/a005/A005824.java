package irvine.oeis.a005;

import irvine.oeis.LinearRecurrence;

/**
 * A005824.
 * @author Sean A. Irvine
 */
public class A005824 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005824() {
    super(new long[] {-2, 0, 5, 0}, new long[] {0, 1, 1, 3});
  }
}

