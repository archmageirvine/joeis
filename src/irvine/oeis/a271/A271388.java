package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271388.
 * @author Sean A. Irvine
 */
public class A271388 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271388() {
    super(new long[] {1, 2, -8, 6}, new long[] {0, 1, 2, 6});
  }
}
