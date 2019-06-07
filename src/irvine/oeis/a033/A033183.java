package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033183 <code>a(n) =</code> number of pairs <code>(p,q)</code> such that <code>4*p + 9*q = n</code>.
 * @author Sean A. Irvine
 */
public class A033183 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033183() {
    super(new long[] {-1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0}, new long[] {1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1});
  }
}
