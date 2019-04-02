package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072221 a(n) = 6*a(n-1) - a(n-2) + 2, with a(0)=1, a(1)=4.
 * @author Sean A. Irvine
 */
public class A072221 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072221() {
    super(new long[] {1, -7, 7}, new long[] {1, 4, 25});
  }
}
