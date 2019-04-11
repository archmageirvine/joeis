package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128223 <code>a(n) =</code> if <code>n mod 2 = 0</code> then <code>n*(n+1)/2</code> otherwise <code>(n+1)^2/2-1</code>.
 * @author Sean A. Irvine
 */
public class A128223 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128223() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 1, 3, 7, 10});
  }
}
