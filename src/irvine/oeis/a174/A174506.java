package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174506.
 * @author Sean A. Irvine
 */
public class A174506 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174506() {
    super(new long[] {1, 0, 0, -19, 0, 0, 19, 0, 0}, new long[] {1, 3, 17, 1, 75, 321, 1, 1363, 5777});
  }
}
