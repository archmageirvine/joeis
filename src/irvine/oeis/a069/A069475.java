package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069475 First differences of A069474, successive differences of <code>(n+1)^6-n^6</code>.
 * @author Sean A. Irvine
 */
public class A069475 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069475() {
    super(new long[] {1, -3, 3}, new long[] {1560, 3360, 5880});
  }
}
