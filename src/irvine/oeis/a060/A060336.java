package irvine.oeis.a060;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060336 Number of n X n {-1,0,1} matrices modulo rows permutation (by symmetry this is the same as the number of {-1,0,1} matrices modulo columns permutation), i.e., the number of equivalence classes where two matrices A and B are equivalent if one of them is the result of permuting the rows of the other.
 * @author Sean A. Irvine
 */
public class A060336 extends Sequence1 {

  private int mN = 0;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(3);
    return Binomial.binomial(mT.add(++mN - 1), Z.valueOf(mN));
  }
}
