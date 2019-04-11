package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053157 Number of 3-element intersecting families (with not necessary distinct sets) whose union is an n-element set.
 * @author Sean A. Irvine
 */
public class A053157 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053157() {
    super(new long[] {-840, 2038, -1849, 820, -190, 22}, new long[] {1, 5, 32, 235, 1816, 14055});
  }
}
