package irvine.oeis.a244;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A244869 Number of magic labelings with magic sum n of first graph shown in link.
 * @author Sean A. Irvine
 */
public class A244869 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244869() {
    super(new long[] {-1, 5, -9, 5, 5, -9, 5}, new long[] {1, 9, 43, 143, 379, 859, 1738});
  }
}
