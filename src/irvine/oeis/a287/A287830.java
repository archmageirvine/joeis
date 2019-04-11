package irvine.oeis.a287;

import irvine.oeis.LinearRecurrence;

/**
 * A287830 Number of sequences over the alphabet <code>{0,1,</code>...,9} such that no two consecutive terms have distance 7.
 * @author Sean A. Irvine
 */
public class A287830 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287830() {
    super(new long[] {4, 9}, new long[] {1, 10});
  }
}
