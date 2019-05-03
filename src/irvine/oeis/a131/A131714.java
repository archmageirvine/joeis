package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131714 Period <code>6</code>: repeat <code>[1, -2, 2, -1, 2, -2]</code>.
 * @author Sean A. Irvine
 */
public class A131714 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131714() {
    super(new long[] {-1, 0, 0}, new long[] {1, -2, 2});
  }
}
