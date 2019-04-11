package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070432 Period 4: repeat <code>[0, 1, 4, 1]</code>; <code>a(n) = n^2 mod 8</code>.
 * @author Sean A. Irvine
 */
public class A070432 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070432() {
    super(new long[] {1, 0, 0, 0}, new long[] {0, 1, 4, 1});
  }
}
