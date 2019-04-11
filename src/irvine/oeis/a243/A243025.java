package irvine.oeis.a243;

import irvine.oeis.FiniteSequence;

/**
 * A243025 Fixed points of the transform <code>n =</code> d_(k)*10^(k-1) + d_(k-1)*10^(k-2) <code>+ ... +</code> d_(2)*10 + d_(1) <code>-&gt;</code> Sum_{i=1..k-1}{d_(i)^d(i+1)}+d(k)^d(1) (A243023).
 * @author Georg Fischer
 */
public class A243025 extends FiniteSequence {

  /** Construct the sequence. */
  public A243025() {
    super(1, 4155, 4355, 1953504, 1954329, 522169982L);
  }
}
