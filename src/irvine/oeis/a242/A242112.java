package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242112.
 * @author Sean A. Irvine
 */
public class A242112 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242112() {
    super(new long[] {-1, 0, 1, 0, 0, 0, 1, 0}, new long[] {1, 1, 2, 2, 3, 2, 4, 3});
  }
}
