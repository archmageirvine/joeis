package irvine.oeis.a270;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A270346 a(n) is the number whose base-11 digits are, in order, the first n terms of the simple periodic sequence: repeat 2,3,5,7.
 * @author Sean A. Irvine
 */
public class A270346 extends LinearRecurrence {

  /** Construct the sequence. */
  public A270346() {
    super(1, new long[] {-11, 1, 0, 0, 11}, new long[] {2, 25, 280, 3087, 33959});
  }
}
