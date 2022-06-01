package irvine.oeis.a160;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A160699 A bisection of A063522.
 * @author Sean A. Irvine
 */
public class A160699 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160699() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 17, 154, 531});
  }
}
