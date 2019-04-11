package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218734 <code>a(n) = (31^n-1)/30</code>.
 * @author Sean A. Irvine
 */
public class A218734 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218734() {
    super(new long[] {-31, 32}, new long[] {0, 1});
  }
}
