package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094723 <code>a(n) =</code> Pell(n+2) <code>- 2^n</code>.
 * @author Sean A. Irvine
 */
public class A094723 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094723() {
    super(new long[] {-2, -3, 4}, new long[] {1, 3, 8});
  }
}
