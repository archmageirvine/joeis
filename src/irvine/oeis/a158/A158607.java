package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158607 Period 5: repeat <code>9,11,13,5,7</code>.
 * @author Sean A. Irvine
 */
public class A158607 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158607() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {9, 11, 13, 5, 7});
  }
}
