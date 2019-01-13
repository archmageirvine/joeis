package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083588.
 * @author Sean A. Irvine
 */
public class A083588 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083588() {
    super(new long[] {-36, 69, -43, 11}, new long[] {1, 5, 19, 71});
  }
}
