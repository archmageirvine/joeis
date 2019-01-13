package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254675.
 * @author Sean A. Irvine
 */
public class A254675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254675() {
    super(new long[] {1, -1, -62, 62, 1}, new long[] {1, 13, 44, 776, 2697});
  }
}
