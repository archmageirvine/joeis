package irvine.oeis.a185;

import irvine.oeis.LinearRecurrence;

/**
 * A185065 <code>a(n) = n*(n^3 + 2)</code>.
 * @author Sean A. Irvine
 */
public class A185065 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185065() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 3, 20, 87, 264});
  }
}
