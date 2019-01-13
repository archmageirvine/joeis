package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103145.
 * @author Sean A. Irvine
 */
public class A103145 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103145() {
    super(new long[] {-1, 4, -6, 4}, new long[] {3, 19, 43, 76});
  }
}
