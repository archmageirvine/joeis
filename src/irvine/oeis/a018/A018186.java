package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;

/**
 * A018186 <code>a(n+2) = 3*a(n) - a(n-2)</code> with <code>a(0) = 1, a(1) = 3, a(2) = 6</code>.
 * @author Sean A. Irvine
 */
public class A018186 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018186() {
    super(new long[] {1, 0, 3, 0}, new long[] {1, 3, 6, 9});
  }
}
