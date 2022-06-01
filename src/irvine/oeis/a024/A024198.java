package irvine.oeis.a024;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A024198 4th elementary symmetric function of the first n+3 odd positive integers.
 * @author Sean A. Irvine
 */
public class A024198 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024198() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {105, 1689, 12139, 57379, 208054, 626934, 1646778, 3889578, 8439783});
  }
}
