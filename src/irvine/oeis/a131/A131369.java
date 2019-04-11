package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131369 Period 10: repeat <code>[5, 4, 5, 4, 3, 4, 5, 4, 5, 0]</code>.
 * @author Sean A. Irvine
 */
public class A131369 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131369() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {5, 4, 5, 4, 3, 4, 5, 4, 5, 0});
  }
}
