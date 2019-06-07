package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062393 <code>a(n) = n^5 - (n-1)^5 + (n-2)^5 - ... +(-1)^n*0^5</code>.
 * @author Sean A. Irvine
 */
public class A062393 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062393() {
    super(new long[] {-1, 5, -9, 5, 5, -9, 5}, new long[] {0, 1, 31, 212, 812, 2313, 5463});
  }
}
