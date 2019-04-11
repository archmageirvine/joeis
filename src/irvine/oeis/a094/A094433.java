package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094433 <code>a(n) =</code> left term in M^n <code>* [1 0 0],</code> M = the 3 X 3 matrix <code>[1 -1 0 / -1 3 -2 / 0 -2 2]</code>.
 * @author Sean A. Irvine
 */
public class A094433 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094433() {
    super(new long[] {-6, 6}, new long[] {1, 2});
  }
}
