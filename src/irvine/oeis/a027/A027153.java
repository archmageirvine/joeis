package irvine.oeis.a027;

import irvine.oeis.PartialSumSequence;

/**
 * A027153 <code>a(n) = Sum{T(i,j)}, 0&lt;=j&lt;=i, 0&lt;=i&lt;=n</code>, T given by <code>A027144</code>.
 * @author Sean A. Irvine
 */
public class A027153 extends PartialSumSequence {

  /** Construct the sequence. */
  public A027153() {
    super(new A027151());
  }
}
