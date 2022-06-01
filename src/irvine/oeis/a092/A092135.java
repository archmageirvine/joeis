package irvine.oeis.a092;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A092135 Number of spanning trees with degrees 1 and 3 in S_5 X P_{4n+2}.
 * @author Sean A. Irvine
 */
public class A092135 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092135() {
    super(new long[] {-3888, 38664, -4584, 154}, new long[] {0, 1080, 164592, 20396448});
  }
}
