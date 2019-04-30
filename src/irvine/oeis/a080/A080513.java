package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080513 <code>a(n) = round(n/2) + 1 = ceiling(n/2) + 1 = floor((n+1)/2) + 1</code>.
 * @author Sean A. Irvine
 */
public class A080513 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080513() {
    super(new long[] {-1, 1, 1}, new long[] {1, 2, 2});
  }
}
