package irvine.oeis.a255;
// Generated by gen_seq4.pl simbinom at 2023-03-17 21:33

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A255384 a(n) = sopfr(n)^2 - 2n, where sopfr(n) is the sum of the prime factors of n with multiplicity.
 * @author Georg Fischer
 */
public class A255384 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A255384() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Functions.SOPFR.z(mN).square().subtract(2L * mN);
  }
}
