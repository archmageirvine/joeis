package irvine.oeis.a253;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A253212 a(n) = 9^n + 8.
 * @author Sean A. Irvine
 */
public class A253212 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253212() {
    super(new long[] {-9, 10}, new long[] {9, 17});
  }
}
