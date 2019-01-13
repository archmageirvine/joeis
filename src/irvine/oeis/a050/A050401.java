package irvine.oeis.a050;

import irvine.oeis.LinearRecurrence;

/**
 * A050401.
 * @author Sean A. Irvine
 */
public class A050401 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050401() {
    super(new long[] {-1, 5, 4, -25, -14, 27, 20, 1}, new long[] {8, 1, 41, 142, 933, 4741, 26660, 143697});
  }
}
