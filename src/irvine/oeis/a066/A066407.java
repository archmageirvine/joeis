package irvine.oeis.a066;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A066407 Number of orthogonal arrays OA(6,n,2,1).
 * @author Sean A. Irvine
 */
public class A066407 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066407() {
    super(1, new long[] {-1280, 1184, -336, 34}, new long[] {0, 0, 2880, 109440});
  }
}
