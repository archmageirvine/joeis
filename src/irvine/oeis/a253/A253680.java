package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253680.
 * @author Sean A. Irvine
 */
public class A253680 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253680() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {204, 2940, 16296, 57960, 159060, 368004});
  }
}
