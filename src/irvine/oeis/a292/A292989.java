package irvine.oeis.a292;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000217;

/**
 * A292989 Triangular numbers having exactly 6 divisors.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A292989 extends FilterSequence {

  /** Construct the sequence. */
  public A292989() {
    super(1, new A000217(), v -> Functions.SIGMA0.l(v) == 6);
  }
}
