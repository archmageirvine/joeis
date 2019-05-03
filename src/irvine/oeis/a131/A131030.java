package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131030 Period <code>6</code>: repeat <code>[16, 7, 7, 16, 25, 25]</code>.
 * @author Sean A. Irvine
 */
public class A131030 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131030() {
    super(new long[] {1, -2, 2}, new long[] {16, 7, 7});
  }
}
