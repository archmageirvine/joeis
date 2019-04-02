package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131328 Row sums of triangle A131327.
 * @author Sean A. Irvine
 */
public class A131328 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131328() {
    super(new long[] {-1, -1, 2, 1}, new long[] {1, 4, 5, 12});
  }
}
