package irvine.oeis.a163;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A163183 Primes dividing 2^j + 1 for some odd j.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A163183 extends FilterSequence {

  /** Construct the sequence. */
  public A163183() {
    super(1, new A000040().skip(), k -> Functions.ORDER.z(k, -2).isOdd());
  }
}
