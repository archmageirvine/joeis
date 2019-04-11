package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218749 <code>a(n) = (46^n-1)/45</code>.
 * @author Sean A. Irvine
 */
public class A218749 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218749() {
    super(new long[] {-46, 47}, new long[] {0, 1});
  }
}
