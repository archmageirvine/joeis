package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193356 If n is even then <code>0,</code> otherwise n.
 * @author Sean A. Irvine
 */
public class A193356 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193356() {
    super(new long[] {-1, 0, 2, 0}, new long[] {1, 0, 3, 0});
  }
}
