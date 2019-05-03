package irvine.oeis.a205;

import irvine.oeis.LinearRecurrence;

/**
 * A205651 Period <code>6</code>: repeat <code>[1, 6, 5, 4, 9, 0]</code>.
 * @author Sean A. Irvine
 */
public class A205651 extends LinearRecurrence {

  /** Construct the sequence. */
  public A205651() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {1, 6, 5, 4, 9, 0});
  }
}
