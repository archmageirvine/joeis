package irvine.oeis.a270;

import irvine.oeis.LinearRecurrence;

/**
 * A270740 Period 9: repeat <code>0,1,2,2,0,1,1,2,0</code>.
 * @author Sean A. Irvine
 */
public class A270740 extends LinearRecurrence {

  /** Construct the sequence. */
  public A270740() {
    super(new long[] {1, -1, 0, 1, -1, 0, 1}, new long[] {0, 1, 2, 2, 0, 1, 1});
  }
}
