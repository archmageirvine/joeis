package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218738 <code>a(n) = (35^n-1)/34</code>.
 * @author Sean A. Irvine
 */
public class A218738 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218738() {
    super(new long[] {-35, 36}, new long[] {0, 1});
  }
}
