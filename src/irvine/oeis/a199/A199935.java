package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199935 Size <code>(b^3_n)</code> of unit sphere in a certain graph (see Hazama article for precise <code>definition)</code>.
 * @author Sean A. Irvine
 */
public class A199935 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199935() {
    super(new long[] {-1, 1, 1, -3, 3}, new long[] {0, 0, 2, 5, 9});
  }
}
