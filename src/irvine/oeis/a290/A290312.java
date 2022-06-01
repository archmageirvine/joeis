package irvine.oeis.a290;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A290312 Third diagonal sequence of the Sheffer triangle A094816 (special Charlier).
 * @author Sean A. Irvine
 */
public class A290312 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290312() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 8, 29, 75, 160});
  }
}
