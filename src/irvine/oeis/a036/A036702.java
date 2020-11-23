package irvine.oeis.a036;

import irvine.oeis.PartialSumSequence;

/**
 * A036702 a(n)=number of Gaussian integers z=a+bi satisfying |z|&lt;=n, a&gt;=0, 0&lt;=b&lt;=a.
 * @author Sean A. Irvine
 */
public class A036702 extends PartialSumSequence {

  /** Construct the sequence. */
  public A036702() {
    super(new A036703());
  }
}

