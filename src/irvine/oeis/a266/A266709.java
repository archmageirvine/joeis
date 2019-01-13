package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266709.
 * @author Sean A. Irvine
 */
public class A266709 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266709() {
    super(new long[] {-1, 2, 2}, new long[] {-7, -25, -59});
  }
}
