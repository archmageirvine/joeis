package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021074.
 * @author Sean A. Irvine
 */
public class A021074 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021074() {
    super(new long[] {-40, 78, -49, 12}, new long[] {1, 12, 95, 630});
  }
}
