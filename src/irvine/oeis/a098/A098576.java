package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098576 a(n) = Sum_{k=0..floor(n/4)} C(n-2*k,2*k) * 3^k.
 * @author Sean A. Irvine
 */
public class A098576 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098576() {
    super(new long[] {3, 0, -1, 2}, new long[] {1, 1, 1, 1});
  }
}
