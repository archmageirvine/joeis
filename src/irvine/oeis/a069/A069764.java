package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069764.
 * @author Sean A. Irvine
 */
public class A069764 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069764() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {89, 773, 3611, 12179, 33349, 78889, 167383});
  }
}
