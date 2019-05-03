package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271663 Convolution of nonzero squares <code>(A000290)</code> with nonzero pentagonal numbers <code>(A000326)</code>.
 * @author Sean A. Irvine
 */
public class A271663 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271663() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 9, 41, 131, 336, 742});
  }
}
