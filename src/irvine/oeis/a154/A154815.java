package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154815 Period <code>6</code>: repeat <code>[8, 7, 4, 5, 2, 1]</code>.
 * @author Sean A. Irvine
 */
public class A154815 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154815() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {8, 7, 4, 5, 2, 1});
  }
}
