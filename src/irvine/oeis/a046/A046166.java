package irvine.oeis.a046;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A046166 Number of minimal covers on n objects with 5 members.
 * @author Sean A. Irvine
 */
public class A046166 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046166() {
    super(new long[] {-530122320, 112007964, -9853624, 461985, -12175, 171}, new long[] {0, 0, 0, 0, 1, 171});
  }
}
