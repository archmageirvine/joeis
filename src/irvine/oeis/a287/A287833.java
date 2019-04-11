package irvine.oeis.a287;

import irvine.oeis.LinearRecurrence;

/**
 * A287833 Number of words of length n over the alphabet <code>{0,1,</code>...,10} such that no two consecutive terms have distance 2.
 * @author Sean A. Irvine
 */
public class A287833 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287833() {
    super(new long[] {1, 19, 16, -37, -2, 10}, new long[] {1, 11, 103, 967, 9079, 85243});
  }
}
