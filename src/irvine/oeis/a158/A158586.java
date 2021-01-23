package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158586 a(n) = 34*n^2 + 1.
 * @author Sean A. Irvine
 */
public class A158586 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158586() {
    super(new long[] {1, -3, 3}, new long[] {1, 35, 137});
  }
}
