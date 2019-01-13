package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153361.
 * @author Sean A. Irvine
 */
public class A153361 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153361() {
    super(new long[] {1, 3, -6, -4, 5, 1}, new long[] {12, 22, 42, 80, 154, 296});
  }
}
