package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218747 <code>a(n) = (44^n-1)/43</code>.
 * @author Sean A. Irvine
 */
public class A218747 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218747() {
    super(new long[] {-44, 45}, new long[] {0, 1});
  }
}
