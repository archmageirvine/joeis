package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016767 a(n) = (3*n)^3.
 * @author Sean A. Irvine
 */
public class A016767 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016767() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 27, 216, 729});
  }
}
