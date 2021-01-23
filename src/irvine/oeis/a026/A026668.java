package irvine.oeis.a026;

import irvine.oeis.PartialSumSequence;

/**
 * A026668 Sum{T(i,j)}, 0&lt;=i&lt;=n, 0&lt;=j&lt;=n, T given by A026659.
 * @author Sean A. Irvine
 */
public class A026668 extends PartialSumSequence {

  /** Construct the sequence. */
  public A026668() {
    super(new A026666());
  }
}
