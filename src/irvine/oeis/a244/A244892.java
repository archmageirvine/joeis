package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244892 <code>a(n) = a(n-a(n-1))</code> with initial values <code>5,2,5,2</code>.
 * @author Sean A. Irvine
 */
public class A244892 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244892() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {5, 2, 5, 2, 5});
  }
}
