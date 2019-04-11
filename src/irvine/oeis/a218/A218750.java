package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218750 <code>a(n) = (47^n-1)/46</code>.
 * @author Sean A. Irvine
 */
public class A218750 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218750() {
    super(new long[] {-47, 48}, new long[] {0, 1});
  }
}
