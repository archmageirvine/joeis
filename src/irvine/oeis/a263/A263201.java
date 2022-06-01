package irvine.oeis.a263;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A263201 Number of perfect matchings on a M\u00f6bius strip of width 4 and length n.
 * @author Sean A. Irvine
 */
public class A263201 extends LinearRecurrence {

  /** Construct the sequence. */
  public A263201() {
    super(new long[] {1, -1, -13, 7, 61, -12, -128, 0, 128, 12, -61, -7, 13, 1}, new long[] {11, 37, 71, 252, 539, 1813, 4271, 13519, 34276, 103803, 276119, 813417, 2226851, 6455052});
  }
}
