package irvine.oeis.a129;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A129003 (n^3+n^2)*3^n.
 * @author Sean A. Irvine
 */
public class A129003 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129003() {
    super(1, new long[] {-81, 108, -54, 12}, new long[] {6, 108, 972, 6480});
  }
}
