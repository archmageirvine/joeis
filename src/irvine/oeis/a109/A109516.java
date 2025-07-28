package irvine.oeis.a109;
// manually 2025-07-28/poly at 2025-07-28 18:52

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.PrependSequence;

/**
 * A109516 a(n) is the (1,2)-entry of the n-th power of the 2 X 2 matrix [0,1;n-1,n-1].
 * @author Georg Fischer
 */
public class A109516 extends PrependSequence {

  /** Construct the sequence. */
  public A109516() {
    super(1, new PolynomialFieldSequence(1, "[1]", "1,1,x,n,*,-,x,<1,n,*,-,/"), 1);
  }
}
