package irvine.oeis.a046;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A046189 Octagonal pentagonal numbers.
 * @author Sean A. Irvine
 */
public class A046189 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046189() {
    super(1, new long[] {1, -1, -1331714, 1331714, 1}, new long[] {1, 176, 1575425, 234631320, 2098015778145L});
  }
}
