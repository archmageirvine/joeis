package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123684 Alternate A016777(n) with A000027(n).
 * @author Sean A. Irvine
 */
public class A123684 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123684() {
    super(new long[] {-1, 0, 2, 0}, new long[] {1, 1, 4, 2});
  }
}
