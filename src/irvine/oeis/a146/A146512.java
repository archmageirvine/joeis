package irvine.oeis.a146;

import irvine.oeis.LinearRecurrence;

/**
 * A146512 Numbers congruent to <code>{1, 3} mod 12</code>.
 * @author Sean A. Irvine
 */
public class A146512 extends LinearRecurrence {

  /** Construct the sequence. */
  public A146512() {
    super(new long[] {-1, 1, 1}, new long[] {1, 3, 13});
  }
}
