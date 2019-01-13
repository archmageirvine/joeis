package irvine.oeis.a185;

import irvine.oeis.LinearRecurrence;

/**
 * A185019.
 * @author Sean A. Irvine
 */
public class A185019 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185019() {
    super(new long[] {1, -3, 3}, new long[] {0, 11, 50});
  }
}
