package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055267 a(n) = 3*a(n-1) - a(n-2) with a(0)=1, a(1)=7.
 * @author Sean A. Irvine
 */
public class A055267 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055267() {
    super(new long[] {-1, 3}, new long[] {1, 7});
  }
}
