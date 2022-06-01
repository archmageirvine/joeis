package irvine.oeis.a253;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A253209 a(n) = 6^n + 5.
 * @author Sean A. Irvine
 */
public class A253209 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253209() {
    super(new long[] {-6, 7}, new long[] {6, 11});
  }
}
