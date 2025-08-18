package irvine.oeis.a079;

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A079492 Nearest integer to Sum_{k=0..n} binomial(n,k)/2^(k*(k-1)/2).
 * @author Sean A. Irvine
 */
public class A079492 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Rationals.SINGLETON.sum(0, ++mN, k -> new Q(Binomial.binomial(mN, k), Z.ONE.shiftLeft(k * (k - 1L) / 2))).round();
  }
}

