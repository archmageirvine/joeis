package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145137.
 * @author Sean A. Irvine
 */
public class A145137 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145137() {
    super(new long[] {1, -8, 28, -55, 61, -20, -56, 118, -125, 84, -36, 9}, new long[] {0, 1, 9, 45, 165, 496, 1297, 3058, 6655, 13586, 26323, 48829});
  }
}
