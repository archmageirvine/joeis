package irvine.oeis.a243;

import irvine.oeis.FiniteSequence;

/**
 * A243024 Consider a k-digit number <code>n =</code> d_(k)*10^(k-1) + d_(k-1)*10^(k-2) + &#8230; + d_(2)*10 + d_(1). Sequence lists the numbers n that divide <code>Sum_{i=1.</code>.k-1}{d_(i)^d_(i+1)}+d_(k)^d_(1).
 * @author Georg Fischer
 */
public class A243024 extends FiniteSequence {

  /** Construct the sequence. */
  public A243024() {
    super(1, 2, 3, 4, 5, 6, 7, 8, 9, 63, 448, 1899, 1942, 4155, 4355, 8503, 28375, 44569, 73687, 1953504, 1954329, 70860598, 522169982L);
  }
}
