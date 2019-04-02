package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253724 Numbers c(n) whose squares are equal to the sums of a number M(n) of consecutive cubed integers b^3 + (b+1)^3 + ... + (b+M-1)^3 = c^2, starting at b(n) (A002593) for M(n) being twice a squared integer (A001105).
 * @author Sean A. Irvine
 */
public class A253724 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253724() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {504, 8721, 65472, 312375, 1119528, 3293829, 8388096, 19131147});
  }
}
