package irvine.oeis.a205;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A205087 a(n)=n 7's sandwiched between two 1's.
 * @author Sean A. Irvine
 */
public class A205087 extends LinearRecurrence {

  /** Construct the sequence. */
  public A205087() {
    super(new long[] {-10, 11}, new long[] {11, 171});
  }
}
