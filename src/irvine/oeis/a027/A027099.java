package irvine.oeis.a027;

import irvine.oeis.PartialSumSequence;

/**
 * A027099 <code>a(n) = Sum{T(i,j)}, 0&lt;=j&lt;=i, 0&lt;=i&lt;=n</code>, T given by <code>A027082</code>.
 * @author Sean A. Irvine
 */
public class A027099 extends PartialSumSequence {

  /** Construct the sequence. */
  public A027099() {
    super(new A027098());
  }
}
