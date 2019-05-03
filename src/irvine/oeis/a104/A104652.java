package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104652 Numbers k such that <code>29*k^2 + 29*k +1 = n^2, n</code> sequence <code>= A104651</code>.
 * @author Sean A. Irvine
 */
public class A104652 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104652() {
    super(new long[] {-1, 1, 0, -19602, 19602, 0, 1}, new long[] {0, 32, 3080, 6720, 637032, 60383960, 131735240});
  }
}
