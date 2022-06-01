package irvine.oeis.a272;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A272665 Imaginary parts of b(n) sequence used to define A143056.
 * @author Sean A. Irvine
 */
public class A272665 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272665() {
    super(new long[] {-1, -2, 0, 2}, new long[] {0, 0, 1, 2});
  }
}
