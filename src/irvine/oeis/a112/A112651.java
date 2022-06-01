package irvine.oeis.a112;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A112651 Numbers k such that k^2 == k (mod 11).
 * @author Sean A. Irvine
 */
public class A112651 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112651() {
    super(new long[] {-1, 1, 1}, new long[] {0, 1, 11});
  }
}
