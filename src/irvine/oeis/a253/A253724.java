package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253724 Numbers <code>c(n)</code> whose squares are equal to the sums of a number <code>M(n)</code> of consecutive cubed integers <code>b^3 + (b+1)^3 + ... + (b+M-1)^3 = c^2</code>, starting at <code>b(n) (A002593)</code> for <code>M(n)</code> being twice a squared integer <code>(A001105)</code>.
 * @author Sean A. Irvine
 */
public class A253724 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253724() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {504, 8721, 65472, 312375, 1119528, 3293829, 8388096, 19131147});
  }
}
