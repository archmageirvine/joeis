package irvine.oeis.a185;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A185273 Period 6: repeat [1, 6, 5, 6, 1, 0].
 * @author Sean A. Irvine
 */
public class A185273 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185273() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {1, 6, 5, 6, 1, 0});
  }
}
