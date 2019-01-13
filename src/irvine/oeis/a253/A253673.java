package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253673.
 * @author Sean A. Irvine
 */
public class A253673 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253673() {
    super(new long[] {1, -1, -98, 98, 1}, new long[] {1, 16, 65, 1520, 6321});
  }
}
