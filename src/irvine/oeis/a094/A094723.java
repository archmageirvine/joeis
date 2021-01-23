package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094723 a(n) = Pell(n+2) - 2^n.
 * @author Sean A. Irvine
 */
public class A094723 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094723() {
    super(new long[] {-2, -3, 4}, new long[] {1, 3, 8});
  }
}
