package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027931 <code>T(n,2n-8),</code> T given by A027926.
 * @author Sean A. Irvine
 */
public class A027931 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027931() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 2, 5, 13, 34, 88, 221, 530, 1204});
  }
}
