package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020873 a(n) = number of cycles in Moebius ladder M_n.
 * @author Sean A. Irvine
 */
public class A020873 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020873() {
    super(new long[] {-2, 7, -9, 5}, new long[] {2, 3, 7, 15});
  }
}
