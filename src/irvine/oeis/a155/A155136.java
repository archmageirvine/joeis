package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155136 Integers n such that <code>n+28</code> is a square.
 * @author Sean A. Irvine
 */
public class A155136 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155136() {
    super(new long[] {1, -3, 3}, new long[] {-28, -27, -24});
  }
}
