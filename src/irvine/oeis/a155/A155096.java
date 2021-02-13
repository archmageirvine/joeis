package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155096 Numbers k such that k^2 == -1 (mod 29).
 * @author Sean A. Irvine
 */
public class A155096 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155096() {
    super(new long[] {-1, 1, 1}, new long[] {12, 17, 41});
  }
}
