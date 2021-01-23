package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292465 a(n) = n*F(n)*F(n+1), where F = A000045.
 * @author Sean A. Irvine
 */
public class A292465 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292465() {
    super(new long[] {-1, 6, -9, -6, 20, -6, -9, 6}, new long[] {0, 1, 4, 18, 60, 200, 624, 1911});
  }
}
