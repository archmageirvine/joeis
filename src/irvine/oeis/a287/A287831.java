package irvine.oeis.a287;

import irvine.oeis.LinearRecurrence;

/**
 * A287831 Number of sequences over the alphabet <code>{0,1,</code>...,9} such that no two consecutive terms have distance 8.
 * @author Sean A. Irvine
 */
public class A287831 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287831() {
    super(new long[] {6, 9}, new long[] {1, 10});
  }
}
