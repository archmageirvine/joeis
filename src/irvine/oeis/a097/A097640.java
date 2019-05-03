package irvine.oeis.a097;

import irvine.oeis.FiniteSequence;

/**
 * A097640 Numbers n such that <code>n=(d_1+d_2+...+d_k)*prime(d_1+d_2+...+d_k)</code> where <code>d_1 d_2</code> ... <code>d_k</code> is the decimal expansion of n.
 * @author Georg Fischer
 */
public class A097640 extends FiniteSequence {

  /** Construct the sequence. */
  public A097640() {
    super(152, 207, 444, 1098);
  }
}
