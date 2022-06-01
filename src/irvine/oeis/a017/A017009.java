package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017009 a(n) = (7*n + 2)^5.
 * @author Sean A. Irvine
 */
public class A017009 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017009() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {32, 59049, 1048576, 6436343, 24300000, 69343957});
  }
}
