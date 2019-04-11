package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218456 <code>2*n^3 - 313*n^2 + 6823*n - 13633</code>.
 * @author Sean A. Irvine
 */
public class A218456 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218456() {
    super(new long[] {-1, 4, -6, 4}, new long[] {-13633, -7121, -1223, 4073});
  }
}
