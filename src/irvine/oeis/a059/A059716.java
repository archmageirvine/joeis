package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059716.
 * @author Sean A. Irvine
 */
public class A059716 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059716() {
    super(new long[] {-1, 7, -10, 6}, new long[] {1, 3, 11, 42});
  }
}
