package irvine.oeis.a007;

import irvine.oeis.LinearRecurrence;

/**
 * A007070 <code>a(n) = 4*a(n-1) - 2*a(n-2)</code> with <code>a(0) = 1, a(1) = 4</code>.
 * @author Sean A. Irvine
 */
public class A007070 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007070() {
    super(new long[] {-2, 4}, new long[] {1, 4});
  }
}

