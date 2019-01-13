package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078052.
 * @author Sean A. Irvine
 */
public class A078052 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078052() {
    super(new long[] {-2, -2, -1}, new long[] {1, -2, 0});
  }
}
