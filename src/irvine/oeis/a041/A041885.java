package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041885 Denominators of continued fraction convergents to sqrt(464).
 * @author Sean A. Irvine
 */
public class A041885 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041885() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 19602, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 11, 13, 24, 37, 209, 246, 455, 19356, 19811, 39167, 215646, 254813, 470459, 725272, 4096819, 4822091, 8918910});
  }
}
