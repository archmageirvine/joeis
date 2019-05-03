package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131534 Period <code>3</code>: repeat <code>[1, 2, 1]</code>.
 * @author Sean A. Irvine
 */
public class A131534 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131534() {
    super(new long[] {1, 0, 0}, new long[] {1, 2, 1});
  }
}
