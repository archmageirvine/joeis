package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218729 <code>a(n) = (26^n-1)/25</code>.
 * @author Sean A. Irvine
 */
public class A218729 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218729() {
    super(new long[] {-26, 27}, new long[] {0, 1});
  }
}
