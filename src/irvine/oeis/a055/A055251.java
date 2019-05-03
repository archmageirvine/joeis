package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055251 Eighth column of triangle <code>A055249</code>.
 * @author Sean A. Irvine
 */
public class A055251 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055251() {
    super(new long[] {-4, 28, -85, 146, -155, 104, -43, 10}, new long[] {1, 10, 57, 244, 874, 2772, 8054, 21920});
  }
}
