package irvine.oeis.a126;
// manually 2026-08-02

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A126168 Sum of the proper infinitary divisors of n.
 * @author Georg Fischer
 */
public class A126168 extends Sequence1 implements DirectSequence {

  protected long mN;

  /** Construct the sequence. */
  public A126168() {
    mN = 0;
  }

  @Override
  public Z next() {
    return a(++mN);
  }


  @Override
  public Z a(final Z n) {
    return Functions.INFINITARY_SIGMA1.z(n);
  }

  @Override
  public Z a(final long n) {
    return Functions.INFINITARY_SIGMA1.z(n);
  }

}
