package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218732 <code>a(n) = (29^n-1)/28</code>.
 * @author Sean A. Irvine
 */
public class A218732 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218732() {
    super(new long[] {-29, 30}, new long[] {0, 1});
  }
}
