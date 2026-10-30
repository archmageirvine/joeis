package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A087126 Primes of the form p^k - p^(k-1) + 1 for some prime p and integer k &gt; 1.
 * @author Sean A. Irvine
 */
public class A087126 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A087126() {
    super(1, 1, 2, (j, k) -> {
      final Z p = Functions.PRIME.z(j);
      final Z pk1 = p.pow(k - 1);
      return pk1.multiply(p).subtract(pk1).add(1);
    });
  }

  @Override
  protected boolean accept(final long x, final long y, final Z n, final Z prev) {
    return super.accept(x, y, n, prev) && n.isProbablePrime();
  }
}
