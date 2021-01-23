package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157862 a(n) = 1728000*n + 240.
 * @author Sean A. Irvine
 */
public class A157862 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157862() {
    super(new long[] {-1, 2}, new long[] {1728240, 3456240});
  }
}
