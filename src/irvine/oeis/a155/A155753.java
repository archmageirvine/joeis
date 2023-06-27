package irvine.oeis.a155;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A155753 a(n) = (n^3 - n + 9)/3.
 * @author Sean A. Irvine
 */
public class A155753 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155753() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {3, 5, 11, 23});
  }
}
