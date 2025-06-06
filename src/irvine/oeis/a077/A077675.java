package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a005.A005117;

/**
 * A077675 Squarefree numbers with square nonzero square digits.
 * @author Sean A. Irvine
 */
public class A077675 extends FilterSequence {

  /** Construct the sequence. */
  public A077675() {
    super(1, new A005117().skip(), k -> (Functions.SYNDROME.i(k) & 0b0011101101) == 0);
  }
}
