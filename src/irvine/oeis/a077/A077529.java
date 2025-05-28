package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A077529 Triangle in which the n-th row contains n palindromic multiples of n, or 0's if no such palindromes exist.
 * @author Sean A. Irvine
 */
public class A077529 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private Sequence mGen = null;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
      mGen = new FilterSequence(new A002113().skip(1), k -> k.mod(mN) == 0);
    }
    return mN % 10 == 0 ? Z.ZERO : mGen.next();
  }
}
