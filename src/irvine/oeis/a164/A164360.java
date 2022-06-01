package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164360 Period 3: repeat [5, 4, 3].
 * @author Sean A. Irvine
 */
public class A164360 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164360() {
    super(new long[] {1, 0, 0}, new long[] {5, 4, 3});
  }
}
