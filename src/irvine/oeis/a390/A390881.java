package irvine.oeis.a390;

import irvine.math.function.Functions;
import irvine.oeis.Combiner;
import irvine.oeis.a000.A000203;
import irvine.oeis.a018.A018804;

/**
 * A390881 a(n) = gcd(A018804(n), A000203(n)).
 * @author Sean A. Irvine
 */
public class A390881 extends Combiner {

  /** Construct the sequence. */
  public A390881() {
    super(1, new A018804(), new A000203(), Functions.GCD::z);
  }
}
