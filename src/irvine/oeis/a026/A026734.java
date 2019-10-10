package irvine.oeis.a026;

import irvine.oeis.PartialSumSequence;

/**
 * A026734 <code>Sum{T(i,j)}, 0&lt;=i&lt;=n, 0&lt;=j&lt;=n</code>, T given by <code>A026725</code>.
 * @author Sean A. Irvine
 */
public class A026734 extends PartialSumSequence {

  /** Construct the sequence. */
  public A026734() {
    super(new A026732());
  }
}
