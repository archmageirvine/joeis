package irvine.oeis.a065;

import irvine.oeis.LinearRecurrence;

/**
 * A065929.
 * @author Sean A. Irvine
 */
public class A065929 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065929() {
    super(new long[] {1, -13, 13}, new long[] {3, 35, 416});
  }
}
