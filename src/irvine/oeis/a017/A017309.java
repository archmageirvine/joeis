package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017309 <code>a(n) = (10*n + 3)^5</code>.
 * @author Sean A. Irvine
 */
public class A017309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017309() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {243, 371293, 6436343, 39135393, 147008443, 418195493});
  }
}
