package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083817 Interleaving of (1,2,3,4,5,...), (2,2,2,2,...) and (0,1,3,6,10,...).
 * @author Sean A. Irvine
 */
public class A083817 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083817() {
    super(new long[] {1, 0, 0, -3, 0, 0, 3, 0, 0}, new long[] {1, 2, 0, 2, 2, 1, 3, 2, 3});
  }
}
