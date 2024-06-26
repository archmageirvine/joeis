package irvine.oeis.a304;
// Generated by gen_seq4.pl sumdiv2/sumdiv at 2023-04-10 10:08

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A304819 Dirichlet convolution of r with zeta, where r(n) = (-1)^Omega(n) if n is 1 or not a perfect power and r(n) = 0 otherwise.
 * @author Georg Fischer
 */
public class A304819 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A304819() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> (Z.valueOf(d).isPower() == null) ? (((Functions.BIG_OMEGA.l(d) & 1) == 0) ? Z.ONE : Z.NEG_ONE) : Z.ZERO);
  }
}
