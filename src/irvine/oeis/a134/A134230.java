package irvine.oeis.a134;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A134230 a(n) = (10^n+1)^2-1.
 * @author Sean A. Irvine
 */
public class A134230 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134230() {
    super(new long[] {-1000, 110}, new long[] {3, 120});
  }
}
