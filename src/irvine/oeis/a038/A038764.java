package irvine.oeis.a038;

import irvine.oeis.LinearRecurrence;

/**
 * A038764 <code>a(n) = (9*n^2 + 3*n + 2)/2</code>.
 * @author Sean A. Irvine
 */
public class A038764 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038764() {
    super(new long[] {1, -3, 3}, new long[] {1, 7, 22});
  }
}
