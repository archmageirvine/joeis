package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084902 a(n) = 5^(n-1)*n*(n+1)/2.
 * @author Sean A. Irvine
 */
public class A084902 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084902() {
    super(new long[] {125, -75, 15}, new long[] {0, 1, 15});
  }
}
