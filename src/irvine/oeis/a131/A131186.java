package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131186 Period 12: repeat <code>0, 1, 2, 0, 2, 4, 0, 4, 3, 0, 3, 1</code>.
 * @author Sean A. Irvine
 */
public class A131186 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131186() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 2, 0, 2, 4, 0, 4, 3, 0, 3, 1});
  }
}
