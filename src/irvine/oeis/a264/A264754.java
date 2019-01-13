package irvine.oeis.a264;

import irvine.oeis.LinearRecurrence;

/**
 * A264754.
 * @author Sean A. Irvine
 */
public class A264754 extends LinearRecurrence {

  /** Construct the sequence. */
  public A264754() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 3, 5, 7, 11});
  }
}
