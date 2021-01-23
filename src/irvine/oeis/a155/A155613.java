package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155613 8^n - 3^n + 1.
 * @author Sean A. Irvine
 */
public class A155613 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155613() {
    super(new long[] {24, -35, 12}, new long[] {1, 6, 56});
  }
}
