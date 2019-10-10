package irvine.oeis.a026;

import irvine.oeis.PartialSumSequence;

/**
 * A026679 <code>Sum{T(i,j)}, 0&lt;=i&lt;=n, 0&lt;=j&lt;=n</code>, T given by <code>A026670</code>.
 * @author Sean A. Irvine
 */
public class A026679 extends PartialSumSequence {

  /** Construct the sequence. */
  public A026679() {
    super(new A026677());
  }
}
