package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000290;

/**
 * A077676 Squares using only squarefree digits (2, 3, 5, 6, 7).
 * @author Sean A. Irvine
 */
public class A077676 extends FilterSequence {

  /** Construct the sequence. */
  public A077676() {
    super(1, new A000290(), k -> (Functions.SYNDROME.i(k) & 0b1100010011) == 0);
  }
}
