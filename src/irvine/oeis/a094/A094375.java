package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094375 a(n)=(4^n-2^n)/2+3^n.
 * @author Sean A. Irvine
 */
public class A094375 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094375() {
    super(new long[] {24, -26, 9}, new long[] {1, 4, 15});
  }
}
