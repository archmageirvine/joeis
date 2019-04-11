package irvine.oeis.a185;

import irvine.oeis.LinearRecurrence;

/**
 * A185273 Period 6: repeat <code>[1, 6, 5, 6, 1, 0]</code>.
 * @author Sean A. Irvine
 */
public class A185273 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185273() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {1, 6, 5, 6, 1, 0});
  }
}
