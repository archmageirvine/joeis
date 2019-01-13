package irvine.oeis.a205;

import irvine.oeis.LinearRecurrence;

/**
 * A205087.
 * @author Sean A. Irvine
 */
public class A205087 extends LinearRecurrence {

  /** Construct the sequence. */
  public A205087() {
    super(new long[] {-10, 11}, new long[] {11, 171});
  }
}
