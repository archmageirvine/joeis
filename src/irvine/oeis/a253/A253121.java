package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253121.
 * @author Sean A. Irvine
 */
public class A253121 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253121() {
    super(new long[] {1, -99, 99}, new long[] {18, 1730, 169498});
  }
}
