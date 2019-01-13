package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156721.
 * @author Sean A. Irvine
 */
public class A156721 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156721() {
    super(new long[] {1, -3, 3}, new long[] {19603, 143649, 381939});
  }
}
