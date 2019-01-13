package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061777.
 * @author Sean A. Irvine
 */
public class A061777 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061777() {
    super(new long[] {2, -4, 1, 2}, new long[] {1, 4, 10, 22});
  }
}
