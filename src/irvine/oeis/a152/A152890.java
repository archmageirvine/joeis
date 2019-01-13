package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152890.
 * @author Sean A. Irvine
 */
public class A152890 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152890() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {4, 1, 4, 0, 1});
  }
}
