package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094434 <code>a(n) =</code> rightmost term of <code>M^n * [1 0 0]</code>, with M = the <code>3 X 3</code> matrix <code>[1 -1 0 / -1 3 -2 / 0 -2 2]</code>.
 * @author Sean A. Irvine
 */
public class A094434 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094434() {
    super(new long[] {-6, 6}, new long[] {0, 2});
  }
}
