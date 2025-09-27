package irvine.oeis.a326;
// manually 2025-09-27

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A326128 a(n) = n - A007913(n), where A007913 gives the squarefree part of n.
 * @author Georg Fischer
 */
public class A326128 extends AbstractSequence implements DirectSequence {

  private int mN;

  /** Construct the sequence. */
  public A326128() {
    super(1);
    mN = 0;
  }

  @Override
  public Z a(final Z n) {
    return n.subtract(Functions.CORE.z(n));
  }

  @Override
  public Z a(final int n) {
    return Z.valueOf(n).subtract(Functions.CORE.z(n));
  }

  @Override
  public Z next() {
    return a(++mN);
  }

}
