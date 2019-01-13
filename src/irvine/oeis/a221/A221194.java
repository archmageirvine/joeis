package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221194.
 * @author Sean A. Irvine
 */
public class A221194 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221194() {
    super(new long[] {1, 0, -1, 0, -62, 0, 62, 0, 1, 0}, new long[] {1, 2, 1, 60, 1, 242, 1, 3840, 1, 15122});
  }
}
