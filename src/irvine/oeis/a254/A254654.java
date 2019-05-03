package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254654 Pentagonal numbers <code>(A000326)</code> which are also centered heptagonal numbers <code>(A069099)</code>.
 * @author Sean A. Irvine
 */
public class A254654 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254654() {
    super(new long[] {1, -1, -12098, 12098, 1}, new long[] {1, 22, 11572, 265651, 139997551});
  }
}
