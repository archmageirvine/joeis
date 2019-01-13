package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165527.
 * @author Sean A. Irvine
 */
public class A165527 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165527() {
    super(new long[] {3, -31, 133, -311, 438, -386, 213, -71, 13}, new long[] {1, 2, 6, 22, 86, 335, 1271, 4680, 16766});
  }
}
