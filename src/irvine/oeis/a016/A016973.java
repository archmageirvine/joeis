package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016973 a(n) = (6*n + 5)^5.
 * @author Sean A. Irvine
 */
public class A016973 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016973() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {3125, 161051, 1419857, 6436343, 20511149, 52521875});
  }
}
