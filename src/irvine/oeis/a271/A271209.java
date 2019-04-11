package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271209 <code>a(n) = n^5 + n + 1</code>.
 * @author Sean A. Irvine
 */
public class A271209 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271209() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 3, 35, 247, 1029, 3131});
  }
}
