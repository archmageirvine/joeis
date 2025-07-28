package irvine.oeis.a327;
// manually 2025-07-28/poly at 2025-07-28 18:00

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.PrependSequence;

/**
 * A327006 a(n) = A327005(n, n).
 * @author Georg Fischer
 */
public class A327006 extends PrependSequence {

  /** Construct the sequence. */
  public A327006() {
    super(1, new PolynomialFieldSequence(1, "[1],[-1,1]", "1,p1,x,exp,*,+,exp,*n!"), 1);
  }
}
