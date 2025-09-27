package irvine.oeis.a326;
// manually 2025-09-27

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A326127 a(n) = A326126(n) - n, where A326126 gives the sum of all other divisors of n except the squarefree part of n.
 * @author Georg Fischer
 */
public class A326127 extends AbstractSequence implements DirectSequence {

  private int mN;

  /** Construct the sequence. */
  public A326127() {
    super(1);
    mN = 0;
  }

  @Override
  public Z a(final Z n) {
    // a(n) = A000203(n) - A007913(n) - n
    return Functions.SIGMA1.z(n).subtract(Functions.CORE.z(n)).subtract(n);
  }

  @Override
  public Z a(final int n) {
    return Functions.SIGMA1.z(n).subtract(Functions.CORE.z(n)).subtract(n);
  }

  @Override
  public Z next() {
    return a(++mN);
  }

}
