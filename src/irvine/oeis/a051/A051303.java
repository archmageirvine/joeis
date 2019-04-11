package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051303 Number of 3-element proper antichains of an n-element set.
 * @author Sean A. Irvine
 */
public class A051303 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051303() {
    super(new long[] {5760, -14832, 14756, -7504, 2135, -343, 29}, new long[] {0, 0, 0, 1, 30, 605, 9030});
  }
}
