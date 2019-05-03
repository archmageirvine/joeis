package irvine.oeis.a205;

import irvine.oeis.LinearRecurrence;

/**
 * A205185 Period <code>6</code>: repeat <code>[1, 8, 9, 8, 1, 0]</code>.
 * @author Sean A. Irvine
 */
public class A205185 extends LinearRecurrence {

  /** Construct the sequence. */
  public A205185() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {1, 8, 9, 8, 1, 0});
  }
}
