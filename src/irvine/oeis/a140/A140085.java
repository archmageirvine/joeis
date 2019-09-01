package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140085 Period <code>8</code>: repeat <code>[0,1,1,2,1,2,2,3]</code>.
 * @author Sean A. Irvine
 */
public class A140085 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140085() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 1, 2, 1, 2, 2, 3});
  }
}
