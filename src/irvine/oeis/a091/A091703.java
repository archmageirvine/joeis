package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091703 Count, setting 5n to zero.
 * @author Sean A. Irvine
 */
public class A091703 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091703() {
    super(new long[] {-1, 0, 0, 0, 0, 2, 0, 0, 0, 0}, new long[] {0, 1, 2, 3, 4, 0, 6, 7, 8, 9});
  }
}
