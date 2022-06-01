package irvine.oeis.a195;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A195463 a(n) = 4^(n+1) + 7.
 * @author Sean A. Irvine
 */
public class A195463 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195463() {
    super(new long[] {-4, 5}, new long[] {11, 23});
  }
}
