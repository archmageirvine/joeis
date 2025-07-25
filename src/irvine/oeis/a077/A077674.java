package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a005.A005117;

/**
 * A077674 Squarefree numbers with nonzero squarefree digits (2,3,5,6,7).
 * @author Sean A. Irvine
 */
public class A077674 extends FilterSequence {

  /** Construct the sequence. */
  public A077674() {
    super(1, new A005117(), k -> (Functions.SYNDROME.i(k) & 0b1100010011) == 0);
  }
}
