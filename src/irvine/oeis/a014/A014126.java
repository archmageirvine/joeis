package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014126 Number of partitions of <code>2*n</code> into at most 4 parts.
 * @author Sean A. Irvine
 */
public class A014126 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014126() {
    super(new long[] {-1, 2, 0, -1, -1, 0, 2} , new long[] {1, 2, 5, 9, 15, 23, 34});
  }
}
