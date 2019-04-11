package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078370 <code>a(n) = 4*(n+1)*n + 5</code>.
 * @author Sean A. Irvine
 */
public class A078370 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078370() {
    super(new long[] {1, -3, 3}, new long[] {5, 13, 29});
  }
}
