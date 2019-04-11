package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061005 (Nearest integer to <code>n^6/36) / 2</code>.
 * @author Sean A. Irvine
 */
public class A061005 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061005() {
    super(new long[] {1, -5, 9, -6, 0, 0, 0, 6, -9, 5}, new long[] {0, 1, 10, 57, 217, 648, 1634, 3641, 7381, 13889});
  }
}
