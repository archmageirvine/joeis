package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017657 <code>a(n) = (12*n + 11)^5</code>.
 * @author Sean A. Irvine
 */
public class A017657 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017657() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {161051, 6436343, 52521875, 229345007, 714924299, 1804229351});
  }
}
