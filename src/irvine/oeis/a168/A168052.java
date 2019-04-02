package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168052 Hankel transform of a Motzkin variant.
 * @author Sean A. Irvine
 */
public class A168052 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168052() {
    super(new long[] {-1, -1, 0, -1}, new long[] {1, -1, 2, -3});
  }
}
