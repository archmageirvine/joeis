package irvine.oeis.a248;

import irvine.oeis.LinearRecurrence;

/**
 * A248974.
 * @author Sean A. Irvine
 */
public class A248974 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248974() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {59, 959, 4859, 15359, 37499});
  }
}
