package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094432 <code>a(n) =</code> rightmost term in M^n <code>* [1 0 0]</code>. M = the 3 X 3 stiffness matrix <code>[1 -1 0 / -1 4 -3 / 0 -3 3]</code>.
 * @author Sean A. Irvine
 */
public class A094432 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094432() {
    super(new long[] {-9, 8}, new long[] {0, 3});
  }
}
