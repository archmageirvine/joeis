package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159956 Period <code>16 : 0,1,2,3,1,2,3,0,2,3,0,1,3,0,1,2 </code>.
 * @author Sean A. Irvine
 */
public class A159956 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159956() {
    super(new long[] {1, -1, 0, 0, 1, -1, 0, 0, 1, -1, 0, 0, 1}, new long[] {0, 1, 2, 3, 1, 2, 3, 0, 2, 3, 0, 1, 3});
  }
}
