package irvine.oeis.a131;

import irvine.oeis.FiniteSequence;

/**
 * A131759 Numbers n such that if for every digit K of n you calculate prime(K)^K and sum for all digits you get n (assumes that prime(0)^0 = 1).
 * @author Georg Fischer
 */
public class A131759 extends FiniteSequence {

  /** Construct the sequence. */
  public A131759() {
    super(1, FINITE, 2420, 2421, 3602725959565L);
  }
}
