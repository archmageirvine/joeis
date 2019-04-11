package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017153 <code>a(n) = (8*n + 7)^5</code>.
 * @author Sean A. Irvine
 */
public class A017153 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017153() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {16807, 759375, 6436343, 28629151, 90224199, 229345007});
  }
}
