package irvine.oeis.a206;

import irvine.oeis.LinearRecurrence;

/**
 * A206426.
 * @author Sean A. Irvine
 */
public class A206426 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206426() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, 0, -6, 6, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 19, 60, 84, 115, 184, 231, 279, 400, 483, 580, 799, 931, 1104, 1495, 1764, 2040, 2739, 3220});
  }
}
