package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.TwoParameterFormSequence;
import irvine.oeis.a002.A002113;

/**
 * A086472 Primes which are sum of two positive palindromes.
 * @author Sean A. Irvine
 */
public class A086472 extends TwoParameterFormSequence {

  private static final DirectSequence S = DirectSequence.create(new A002113());

  /** Construct the sequence. */
  public A086472() {
    super(1, 2, 2, (x, y) -> x <= y ? S.a(x).add(S.a(y)) : null);
  }

  @Override
  protected boolean accept(final long x, final long y, final Z n, final Z prev) {
    return super.accept(x, y, n, prev) && n.isProbablePrime();
  }
}

