package irvine.oeis.a139;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A139617 a(n) = 136*n + 17.
 * @author Sean A. Irvine
 */
public class A139617 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139617() {
    super(new long[] {-1, 2}, new long[] {17, 153});
  }
}
