package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059029.
 * @author Sean A. Irvine
 */
public class A059029 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059029() {
    super(new long[] {-1, 0, 2, 0}, new long[] {0, 3, 2, 7});
  }
}
