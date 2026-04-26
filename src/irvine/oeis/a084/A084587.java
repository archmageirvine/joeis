package irvine.oeis.a084;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084587 Integer floor of the reciprocal of Gauss-Kuzmin distribution of n: a(n) = floor( log(2)/log(1 + 1/(n*(n+2))) ).
 * @author Sean A. Irvine
 */
public class A084587 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return CR.LOG2.divide(CR.valueOf(Q.ONE.add(new Q(1, ++mN * (mN + 2)))).log()).floor();
  }
}

