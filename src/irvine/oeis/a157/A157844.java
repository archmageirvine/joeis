package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157844.
 * @author Sean A. Irvine
 */
public class A157844 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157844() {
    super(new long[] {1, -3, 3}, new long[] {5126401, 154915201, 512064001});
  }
}
