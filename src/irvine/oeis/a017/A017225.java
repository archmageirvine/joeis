package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017225 a(n) = (9*n + 5)^5.
 * @author Sean A. Irvine
 */
public class A017225 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017225() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {3125, 537824, 6436343, 33554432, 115856201, 312500000});
  }
}
