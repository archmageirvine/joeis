package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a002.A002034;

/**
 * A073413 Numbers n such that number of divisors of n divides S(n), the Kempner function A002034.
 * @author Sean A. Irvine
 */
public class A073413 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A073413() {
    super(1, 1, new A002034(), (n, k) -> k.mod(Functions.SIGMA0.l(n)) == 0);
  }
}
