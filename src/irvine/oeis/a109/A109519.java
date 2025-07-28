package irvine.oeis.a109;
// manually 2025-07-28/poly at 2025-07-28 18:37

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.PrependSequence;

/**
 * A109519 a(n) is the (1,2)-entry of the n-th power of the 2 X 2 matrix [0,-1;n-1,n-1].
 * @author Georg Fischer
 */
public class A109519 extends PrependSequence {

  /** Construct the sequence. */
  public A109519() {
    super(1, new PolynomialFieldSequence(1, "[1],[-1]", "1,p1,x,n,*,+,n,x,<1,*,-,/"), -1);
  }
}
