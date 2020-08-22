package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242477 Floor(3*n^2/4).
 * @author Sean A. Irvine
 */
public class A242477 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242477() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 0, 3, 6});
  }
}
