package irvine.oeis.a085;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A085482 Product of three solutions of the Diophantine equation x^2 - y^2 = z^3.
 * @author Sean A. Irvine
 */
public class A085482 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085482() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {54, 13824, 354294, 3538944, 21093750, 90699264, 311299254, 905969664, 2324522934L});
  }
}
