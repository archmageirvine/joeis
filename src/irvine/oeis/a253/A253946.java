package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253946.
 * @author Sean A. Irvine
 */
public class A253946 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253946() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {6, 42, 168, 504, 1260, 2772, 5544});
  }
}
