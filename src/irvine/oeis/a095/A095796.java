package irvine.oeis.a095;

import irvine.oeis.LinearRecurrence;

/**
 * A095796 <code>1 + (26*n+17+7*n^2)*n/2</code>.
 * @author Sean A. Irvine
 */
public class A095796 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095796() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 26, 98, 238});
  }
}
