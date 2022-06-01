package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016742 Even squares: a(n) = (2*n)^2.
 * @author Sean A. Irvine
 */
public class A016742 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016742() {
    super(new long[] {1, -3, 3}, new long[] {0, 4, 16});
  }
}
