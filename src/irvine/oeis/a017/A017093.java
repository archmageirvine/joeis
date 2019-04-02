package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017093 a(n) = (8*n + 2)^5.
 * @author Sean A. Irvine
 */
public class A017093 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017093() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {32, 100000, 1889568, 11881376, 45435424, 130691232});
  }
}
