package irvine.oeis.a375;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a013.A013929;

/**
 * A375055 Nonsquarefree numbers k divisible by at least 3 distinct primes.
 * @author Sean A. Irvine
 */
public class A375055 extends FilterSequence {

  /** Construct the sequence. */
  public A375055() {
    super(1, new A013929(), k -> Functions.OMEGA.i(k) > 2);
  }
}
