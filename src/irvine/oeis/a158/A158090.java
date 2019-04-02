package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158090 Period length 9: repeat 0, 6, 0, 6, 0, 0, 3, 3, 0.
 * @author Sean A. Irvine
 */
public class A158090 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158090() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 6, 0, 6, 0, 0, 3, 3, 0});
  }
}
