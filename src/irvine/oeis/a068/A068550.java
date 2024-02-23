package irvine.oeis.a068;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000984;
import irvine.oeis.a099.A099996;

/**
 * A068550 a(n) = lcm{1, ..., 2n} / binomial(2n, n).
 * @author Sean A. Irvine
 */
public class A068550 extends Combiner {

  /** Construct the sequence. */
  public A068550() {
    super(0, new A099996(), new A000984(), DIVIDE);
  }
}
