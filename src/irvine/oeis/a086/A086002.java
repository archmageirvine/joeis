package irvine.oeis.a086;
// manually 2025-07-03

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A086002 Primes which when added to their own rotation yield a prime.
 * @author Georg Fischer
 */
public class A086002 extends FilterSequence {

  /** Construct the sequence. */
  public A086002() {
    super(1, new A000040(), p -> Predicates.PRIME.is(rotAdd(p)));
  }

  /**
   * The special rotate-add function.
   * @param p a prime
   * @return <code>p + rot(p)</code>, where <code>rot</code> swaps the left and right half of the number string
   */
  protected static Z rotAdd(final Z p) {
    final int len = Functions.DIGIT_LENGTH.i(p);
    final int half = len / 2;
    final String sp = p.toString();
    return p.add(
      (len & 1) == 0
        ? new Z(sp.substring(half) + sp.substring(0, half))
        : new Z(sp.substring(half + 1) + sp.substring(half, half + 1) + sp.substring(0, half))
    );
  }
}
