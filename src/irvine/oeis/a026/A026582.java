package irvine.oeis.a026;

import irvine.oeis.PartialSumSequence;

/**
 * A026582 a(n) = Sum{T(i,j)}, 0&lt;=j&lt;=i, 0&lt;=i&lt;=n, T given by A026568.
 * @author Sean A. Irvine
 */
public class A026582 extends PartialSumSequence {

  /** Construct the sequence. */
  public A026582() {
    super(new A026580());
  }
}
