package irvine.oeis.a082;
// Generated by gen_seq4.pl 2024-06-23/sintrif at 2024-06-23 23:33

import irvine.math.function.Functions;
import irvine.oeis.a009.A009223;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A082055 Product of common prime-divisors (without multiplicity) of sigma(n) and phi(n).
 * @author Georg Fischer
 */
public class A082055 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A082055() {
    super(1, (term, n) -> Functions.SQUARE_FREE_KERNEL.z(term), "", new A009223());
  }
}
