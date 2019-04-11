package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094430 <code>a(n)</code> is the rightmost term of M^n <code>* [1 0 0],</code> where M is the 3 X 3 matrix <code>[0 1 0 / 0 0 1 / 7 -14 7]</code>.
 * @author Sean A. Irvine
 */
public class A094430 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094430() {
    super(new long[] {7, -14, 7}, new long[] {7, 49, 245});
  }
}
