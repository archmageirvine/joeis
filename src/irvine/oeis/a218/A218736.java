package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218736 <code>a(n) = (33^n-1)/32</code>.
 * @author Sean A. Irvine
 */
public class A218736 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218736() {
    super(new long[] {-33, 34}, new long[] {0, 1});
  }
}
