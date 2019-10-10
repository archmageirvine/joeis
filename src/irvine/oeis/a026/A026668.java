package irvine.oeis.a026;

import irvine.oeis.PartialSumSequence;

/**
 * A026668 <code>Sum{T(i,j)}, 0&lt;=i&lt;=n, 0&lt;=j&lt;=n</code>, T given by <code>A026659</code>.
 * @author Sean A. Irvine
 */
public class A026668 extends PartialSumSequence {

  /** Construct the sequence. */
  public A026668() {
    super(new A026666());
  }
}
