package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085293 Product of Lucas <code>(A000204)</code> and a Pell Companion series <code>(A002203)</code>.
 * @author Sean A. Irvine
 */
public class A085293 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085293() {
    super(new long[] {-1, 2, 7, 2}, new long[] {2, 18, 56, 238});
  }
}
