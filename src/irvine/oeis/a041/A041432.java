package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041432 Numerators of continued fraction convergents to <code>sqrt(232)</code>.
 * @author Sean A. Irvine
 */
public class A041432 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041432() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 39206, 0, 0, 0, 0, 0}, new long[] {15, 61, 198, 1447, 4539, 19603, 592629, 2390119, 7762986, 56731021, 177956049, 768555217});
  }
}
