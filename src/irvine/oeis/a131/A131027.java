package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131027 Period <code>6</code>: repeat <code>[4, 3, 1, 0, 1, 3]</code>.
 * @author Sean A. Irvine
 */
public class A131027 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131027() {
    super(new long[] {1, -2, 2}, new long[] {4, 3, 1});
  }
}
