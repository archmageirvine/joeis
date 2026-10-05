package irvine.oeis.a071;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.triangle.DirectArray;

/**
 * A071921 Square array giving number of unimodal functions [n]-&gt;[m] for n&gt;=0, m&gt;=0, with a(0,m)=1 by definition, read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A071921 extends Sequence0 implements DirectArray {

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return a(mM, mN - mM);
  }

  @Override
  public Z a(final long n, final long k) {
    return n == 0 ? Z.ONE : Integers.SINGLETON.sum(0, k - 1, j -> Binomial.binomial(n + 2L * j - 1, 2L * j));
  }

}

