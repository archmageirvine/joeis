package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253211.
 * @author Sean A. Irvine
 */
public class A253211 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253211() {
    super(new long[] {-8, 9}, new long[] {8, 15});
  }
}
