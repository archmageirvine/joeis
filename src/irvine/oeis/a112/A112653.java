package irvine.oeis.a112;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A112653 a(n) squared is congruent to a(n) (mod 13).
 * @author Sean A. Irvine
 */
public class A112653 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112653() {
    super(new long[] {-1, 1, 1}, new long[] {0, 1, 13});
  }
}
