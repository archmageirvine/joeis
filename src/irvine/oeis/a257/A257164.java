package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257164 Period 5 sequence: repeat <code>[0, 2, 4, 1, 3]</code>.
 * @author Sean A. Irvine
 */
public class A257164 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257164() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {0, 2, 4, 1, 3});
  }
}
