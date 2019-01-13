package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178874.
 * @author Sean A. Irvine
 */
public class A178874 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178874() {
    super(new long[] {5, -6, -4, 6}, new long[] {0, 1, 4, 20});
  }
}
