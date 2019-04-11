package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218730 <code>a(n) = (27^n-1)/26</code>.
 * @author Sean A. Irvine
 */
public class A218730 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218730() {
    super(new long[] {-27, 28}, new long[] {0, 1});
  }
}
