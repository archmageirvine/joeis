package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062189 <code>(4n^2+2n)*3^(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A062189 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062189() {
    super(new long[] {27, -27, 9}, new long[] {0, 2, 20});
  }
}
