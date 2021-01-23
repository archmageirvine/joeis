package irvine.oeis.a036;

import irvine.oeis.PartialSumSequence;

/**
 * A036695 a(n)=number of Gaussian integers z=a+bi satisfying |z|&lt;=n, b&gt;=0.
 * @author Sean A. Irvine
 */
public class A036695 extends PartialSumSequence {

  /** Construct the sequence. */
  public A036695() {
    super(new A036696());
  }
}

