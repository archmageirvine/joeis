package irvine.oeis.a109;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A109017 a(n) = Kronecker symbol (-6/n).
 * @author Sean A. Irvine
 */
public class A109017 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109017() {
    super(new long[] {-1, 0, 0, 0, 1, 0, 0, 0}, new long[] {0, 1, 0, 0, 0, 1, 0, 1});
  }
}
