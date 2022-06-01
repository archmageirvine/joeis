package irvine.oeis.a155;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A155645 7^n+6^n-1.
 * @author Sean A. Irvine
 */
public class A155645 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155645() {
    super(new long[] {42, -55, 14}, new long[] {1, 12, 84});
  }
}
