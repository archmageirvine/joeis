package irvine.oeis.a067;

import irvine.oeis.LinearRecurrence;

/**
 * A067869 Numbers n such that n and 2^n end with the same 5 digits.
 * @author Sean A. Irvine
 */
public class A067869 extends LinearRecurrence {

  /** Construct the sequence. */
  public A067869() {
    super(new long[] {-1, 2}, new long[] {48736, 148736});
  }
}
