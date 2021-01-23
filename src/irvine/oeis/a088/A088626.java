package irvine.oeis.a088;

import irvine.oeis.LinearRecurrence;

/**
 * A088626 42*C(n,10).
 * @author Sean A. Irvine
 */
public class A088626 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088626() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 42});
  }
}
