package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105397 Periodic with period <code>2</code>: repeat <code>[4,2]</code>.
 * @author Sean A. Irvine
 */
public class A105397 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105397() {
    super(new long[] {1, 0}, new long[] {4, 2});
  }
}
