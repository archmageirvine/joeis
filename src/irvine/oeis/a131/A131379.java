package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131379 Period <code>4</code>: repeat <code>[1, 0, -1, 1]</code>.
 * @author Sean A. Irvine
 */
public class A131379 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131379() {
    super(new long[] {1, 0, 0, 0}, new long[] {1, 0, -1, 1});
  }
}
