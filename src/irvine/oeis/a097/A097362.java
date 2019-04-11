package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097362 <code>a(n) = (n+1)/2</code> if n is odd, <code>n+2</code> otherwise.
 * @author Sean A. Irvine
 */
public class A097362 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097362() {
    super(new long[] {-1, 0, 2, 0}, new long[] {1, 4, 2, 6});
  }
}
