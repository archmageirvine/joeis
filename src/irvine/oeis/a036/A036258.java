package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036258.
 * @author Sean A. Irvine
 */
public class A036258 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036258() {
    super(new long[] {250, -75, -45, 15}, new long[] {1, 9, 90, 945});
  }
}
