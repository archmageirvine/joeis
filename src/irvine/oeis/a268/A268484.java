package irvine.oeis.a268;

import irvine.oeis.LinearRecurrence;

/**
 * A268484.
 * @author Sean A. Irvine
 */
public class A268484 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268484() {
    super(new long[] {-1, 4, -6, 4}, new long[] {3, 18, 53, 116});
  }
}
