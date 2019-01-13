package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027602.
 * @author Sean A. Irvine
 */
public class A027602 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027602() {
    super(new long[] {-1, 4, -6, 4}, new long[] {9, 36, 99, 216});
  }
}
