package irvine.oeis.a026;

import irvine.oeis.PartialSumSequence;

/**
 * A026767 <code>Sum{T(i,j)}, 0&lt;=i&lt;=n, 0&lt;=j&lt;=n</code>, T given by <code>A026758</code>.
 * @author Sean A. Irvine
 */
public class A026767 extends PartialSumSequence {

  /** Construct the sequence. */
  public A026767() {
    super(new A026765());
  }
}
