package irvine.oeis.a049;

import irvine.oeis.a006.A006093;
import irvine.oeis.closure.DistinctMultiplicativeClosureSequence;

/**
 * A049225 Values of totient function applied to squarefree numbers; or numbers of form Product (p_i-1) where p_i are distinct primes.
 * @author Sean A. Irvine
 */
public class A049225 extends DistinctMultiplicativeClosureSequence {

  /** Construct the sequence. */
  public A049225() {
    super(new A006093());
  }
}
