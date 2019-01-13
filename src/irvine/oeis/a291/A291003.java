package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291003.
 * @author Sean A. Irvine
 */
public class A291003 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291003() {
    super(new long[] {-120, 154, -71, 14}, new long[] {10, 75, 490, 2956});
  }
}
