package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072259 ((6n+37)*4^n-1)/3.
 * @author Sean A. Irvine
 */
public class A072259 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072259() {
    super(new long[] {16, -24, 9}, new long[] {12, 57, 261});
  }
}
