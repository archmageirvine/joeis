package irvine.oeis.a066;

import irvine.oeis.LinearRecurrence;

/**
 * A066407 Number of orthogonal arrays <code>OA(6,n,2,1)</code>.
 * @author Sean A. Irvine
 */
public class A066407 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066407() {
    super(new long[] {-1280, 1184, -336, 34}, new long[] {0, 0, 2880, 109440});
  }
}
