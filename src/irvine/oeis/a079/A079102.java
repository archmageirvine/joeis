package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079102.
 * @author Sean A. Irvine
 */
public class A079102 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079102() {
    super(new long[] {-8, 0, 6, 0}, new long[] {1, 2, 4, 4});
  }
}
