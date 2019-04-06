package irvine.oeis.a107;

import irvine.oeis.FiniteSequence;

/**
 * A107119 Numbers n such that phi(n)=(d_1+d_2+...+d_k)*(d_1!+d_2!+...+d_k!) where d_1 d_2...d_k is the decimal expansion of n.
 * @author Georg Fischer
 */
public class A107119 extends FiniteSequence {

  /** Construct the sequence. */
  public A107119() {
    super(1, 26422, 344070, 666666, 2117108, 5184824, 22047849, 27469743, 55368399, 59546748, 87986556);
  }
}
