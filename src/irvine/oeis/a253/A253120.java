package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253120.
 * @author Sean A. Irvine
 */
public class A253120 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253120() {
    super(new long[] {1, -99, 99}, new long[] {6, 705, 69196});
  }
}
