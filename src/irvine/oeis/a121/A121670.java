package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121670 <code>a(n) = n^3 - 3*n</code>.
 * @author Sean A. Irvine
 */
public class A121670 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121670() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, -2, 2, 18});
  }
}
