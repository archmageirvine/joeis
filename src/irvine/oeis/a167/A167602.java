package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167602.
 * @author Sean A. Irvine
 */
public class A167602 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167602() {
    super(new long[] {-512, -384, -72, -14}, new long[] {1, -14, 124, -1112});
  }
}
