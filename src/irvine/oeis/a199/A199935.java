package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199935 Size (b^3_n) of unit sphere in a certain graph (see Hazama article for precise definition).
 * @author Sean A. Irvine
 */
public class A199935 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199935() {
    super(new long[] {-1, 1, 1, -3, 3}, new long[] {0, 0, 2, 5, 9});
  }
}
