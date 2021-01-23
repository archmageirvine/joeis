package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055269 a(n) = 4*a(n-1) - a(n-2) + 3 with a(0)=1, a(1)=7.
 * @author Sean A. Irvine
 */
public class A055269 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055269() {
    super(new long[] {1, -5, 5}, new long[] {1, 7, 30});
  }
}
