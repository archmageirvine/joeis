package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132954 Period 6: repeat [1, 2, 4, -1, -2, -4].
 * @author Sean A. Irvine
 */
public class A132954 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132954() {
    super(new long[] {-1, 0, 0}, new long[] {1, 2, 4});
  }
}
