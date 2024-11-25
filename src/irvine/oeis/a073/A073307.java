package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a002.A002034;

/**
 * A073307 Numbers k such that S(k)=d(k), where S(k) is the Kempner function (A002034) and d(k) is the number of divisors of k (A000005).
 * @author Sean A. Irvine
 */
public class A073307 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A073307() {
    super(1, 1, new A002034(), (n, k) -> k.equals(Functions.SIGMA0.z(n)));
  }
}

