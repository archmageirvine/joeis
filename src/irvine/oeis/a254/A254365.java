package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254365 <code>a(n) = 2^(n+2) + 3^n + 10</code>.
 * @author Sean A. Irvine
 */
public class A254365 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254365() {
    super(new long[] {6, -11, 6}, new long[] {15, 21, 35});
  }
}
