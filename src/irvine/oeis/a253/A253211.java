package irvine.oeis.a253;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A253211 a(n) = 8^n + 7.
 * @author Sean A. Irvine
 */
public class A253211 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253211() {
    super(new long[] {-8, 9}, new long[] {8, 15});
  }
}
