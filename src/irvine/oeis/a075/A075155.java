package irvine.oeis.a075;

import irvine.oeis.LinearRecurrence;

/**
 * A075155 Cubes of Lucas numbers.
 * @author Sean A. Irvine
 */
public class A075155 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075155() {
    super(new long[] {-1, -3, 6, 3}, new long[] {8, 1, 27, 64});
  }
}
