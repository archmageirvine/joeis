package irvine.oeis.a043;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A043300 Denominator of L(n)=sum(k=1,n,k^n)/sum(k=1,n-1,k^n).
 * @author Sean A. Irvine
 */
public class A043300 extends A043299 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

