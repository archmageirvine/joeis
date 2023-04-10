package irvine.oeis.a192;
// manually sumdiv2/sumdiv at 2023-04-09 11:08

import irvine.math.z.Euler;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A192332 For n &gt;= 3, draw a regular n-sided polygon and its n(n-3)/2 diagonals, so there are n(n-1)/2 lines; a(n) is the number of ways to choose a subset of these lines (subsets differing by a rotation are regarded as identical). a(1)=1, a(2)=2 by convention.
 * @author Georg Fischer
 */
public class A192332 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A192332() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> ((d & 1) > 0) ? Euler.phi(Z.valueOf(d)).multiply(Z.ONE.shiftLeft(mN * (mN - 1) / (2 * d)))
      : Euler.phi(Z.valueOf(d)).multiply(Z.ONE.shiftLeft((mN * mN) / (2 * d)))).divide(mN);
  }
}
