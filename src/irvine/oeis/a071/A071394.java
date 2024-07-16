package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000720;

/**
 * A071394 Numbers n divisible by pi(n) [A057809] with prime pi(n); i.e., largest prime factor of n equals pi(n).
 * @author Sean A. Irvine
 */
public class A071394 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A071394() {
    super(1, 3, new A000720().skip(2), (n, k) -> !k.isZero() && Functions.GPF.l(n) % k.longValueExact() == 0);
  }
}
