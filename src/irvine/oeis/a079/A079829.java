package irvine.oeis.a079;

import irvine.oeis.FiniteSequence;

/**
 * A079829 a(n) = smallest k such that floor(reverse(k)/k) &gt;= n.
 * @author Georg Fischer
 */
public class A079829 extends FiniteSequence {

  /** Construct the sequence. */
  public A079829() {
    super(1, 13, 15, 17, 106, 107, 108, 109, 1089);
  }
}
