package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017393.
 * @author Sean A. Irvine
 */
public class A017393 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017393() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 161051, 5153632, 39135393, 164916224, 503284375});
  }
}
