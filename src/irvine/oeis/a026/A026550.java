package irvine.oeis.a026;

import irvine.oeis.PartialSumSequence;

/**
 * A026550 Sum{T(i,j)}, 0&lt;=j&lt;=i, 0&lt;=i&lt;=n, T given by A026536.
 * @author Sean A. Irvine
 */
public class A026550 extends PartialSumSequence {

  /** Construct the sequence. */
  public A026550() {
    super(new A026548());
  }
}
