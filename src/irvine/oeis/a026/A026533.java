package irvine.oeis.a026;

import irvine.oeis.PartialSumSequence;

/**
 * A026533 Sum{T(i,j)}, 0&lt;=j&lt;=i, 0&lt;=i&lt;=n, T given by A026519.
 * @author Sean A. Irvine
 */
public class A026533 extends PartialSumSequence {

  /** Construct the sequence. */
  public A026533() {
    super(new A026531());
  }
}
