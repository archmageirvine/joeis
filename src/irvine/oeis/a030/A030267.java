package irvine.oeis.a030;

import irvine.oeis.LinearRecurrence;

/**
 * A030267 Compose the natural numbers with themselves, <code>A(x) = B(B(x))</code> where <code>B(x) = x/(1-x)^2</code> is the generating function for natural numbers.
 * @author Sean A. Irvine
 */
public class A030267 extends LinearRecurrence {

  /** Construct the sequence. */
  public A030267() {
    super(new long[] {-1, 6, -11, 6}, new long[] {1, 4, 14, 46});
  }
}
