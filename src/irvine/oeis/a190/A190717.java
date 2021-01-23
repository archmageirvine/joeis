package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190717 Triplicated tetrahedral numbers A000292.
 * @author Sean A. Irvine
 */
public class A190717 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190717() {
    super(new long[] {-1, 1, 0, 3, -3, 0, -3, 3, 0, 1}, new long[] {1, 1, 1, 4, 4, 4, 10, 10, 10, 20});
  }
}
