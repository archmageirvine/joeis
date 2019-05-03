package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158001 Period <code>6</code>: repeat <code>[9, 10, 9, 4, 4, 1]</code>.
 * @author Sean A. Irvine
 */
public class A158001 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158001() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {9, 10, 9, 4, 4, 1});
  }
}
