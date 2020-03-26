package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145923 Second bisection of <code>A061041: a(n) = A061041(2n+1) = (2n+1)*(2n+9)</code>.
 * @author Sean A. Irvine
 */
public class A145923 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145923() {
    super(new long[] {1, -3, 3}, new long[] {9, 33, 65});
  }
}
