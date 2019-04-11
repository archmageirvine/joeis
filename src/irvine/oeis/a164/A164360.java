package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164360 Period 3: repeat <code>[5, 4, 3]</code>.
 * @author Sean A. Irvine
 */
public class A164360 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164360() {
    super(new long[] {1, 0, 0}, new long[] {5, 4, 3});
  }
}
