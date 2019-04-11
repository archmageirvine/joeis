package irvine.oeis.a067;

import irvine.oeis.LinearRecurrence;

/**
 * A067865 Numbers n such that n and <code>2^n</code> end with the same two digits.
 * @author Sean A. Irvine
 */
public class A067865 extends LinearRecurrence {

  /** Construct the sequence. */
  public A067865() {
    super(new long[] {-1, 2}, new long[] {36, 136});
  }
}
