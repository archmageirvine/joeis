package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218746 <code>a(n) = (43^n-1)/42</code>.
 * @author Sean A. Irvine
 */
public class A218746 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218746() {
    super(new long[] {-43, 44}, new long[] {0, 1});
  }
}
