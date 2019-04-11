package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033484 <code>a(n) = 3*2^n - 2</code>.
 * @author Sean A. Irvine
 */
public class A033484 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033484() {
    super(new long[] {-2, 3}, new long[] {1, 4});
  }
}
