package irvine.oeis.a027;

import irvine.oeis.PartialSumSequence;

/**
 * A027130 <code>a(n) = Sum{T(i,j)}, 0&lt;=j&lt;=i, 0&lt;=i&lt;=n</code>, T given by <code>A027113</code>.
 * @author Sean A. Irvine
 */
public class A027130 extends PartialSumSequence {

  /** Construct the sequence. */
  public A027130() {
    super(new A027129());
  }
}
