package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083066 5th row of number array <code>A083064</code>.
 * @author Sean A. Irvine
 */
public class A083066 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083066() {
    super(new long[] {-6, 7}, new long[] {1, 5});
  }
}
