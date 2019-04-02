package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051180 Number of 3-element intersecting families of an n-element set.
 * @author Sean A. Irvine
 */
public class A051180 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051180() {
    super(new long[] {5760, -14832, 14756, -7504, 2135, -343, 29}, new long[] {0, 0, 0, 13, 222, 2585, 25830});
  }
}
