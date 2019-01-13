package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016145.
 * @author Sean A. Irvine
 */
public class A016145 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016145() {
    super(new long[] {-30, 13}, new long[] {1, 13});
  }
}
