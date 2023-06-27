package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133142 Numbers which are both centered square and decagonal numbers.
 * @author Sean A. Irvine
 */
public class A133142 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133142() {
    super(1, new long[] {1, -1443, 1443}, new long[] {1, 1201, 1731661});
  }
}
