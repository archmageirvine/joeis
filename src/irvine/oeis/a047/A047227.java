package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047227.
 * @author Sean A. Irvine
 */
public class A047227 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047227() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 2, 3, 4, 7});
  }
}
