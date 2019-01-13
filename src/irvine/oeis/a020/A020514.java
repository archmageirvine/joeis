package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020514.
 * @author Sean A. Irvine
 */
public class A020514 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020514() {
    super(new long[] {1024, -1984, 1240, -310, 31}, new long[] {5, 31, 341, 4681, 69905});
  }
}
