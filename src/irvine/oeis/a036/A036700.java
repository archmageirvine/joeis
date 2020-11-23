package irvine.oeis.a036;

import irvine.oeis.PartialSumSequence;

/**
 * A036700 Number of Gaussian integers z=a+bi satisfying |z|&lt;=n, a&gt;=0, 0&lt;=b&lt;a.
 * @author Sean A. Irvine
 */
public class A036700 extends PartialSumSequence {

  /** Construct the sequence. */
  public A036700() {
    super(new A036701());
  }
}

