package irvine.oeis.a131;

import irvine.oeis.FiniteSequence;

/**
 * A131759 Numbers n such that if for every digit K of n you calculate <code>prime(K)^K</code> and sum for all digits you get <code>n</code> (assumes that <code>prime(0)^0 = 1)</code>.
 * @author Georg Fischer
 */
public class A131759 extends FiniteSequence {

  /** Construct the sequence. */
  public A131759() {
    super(2420, 2421, 3602725959565L);
  }
}
