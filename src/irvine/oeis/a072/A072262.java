package irvine.oeis.a072;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A072262 a(n) = 4*a(n-1) + 1, a(1)=11.
 * @author Sean A. Irvine
 */
public class A072262 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072262() {
    super(new long[] {-4, 5}, new long[] {11, 45});
  }
}
