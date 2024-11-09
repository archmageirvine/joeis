package irvine.oeis.a072;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A072983 Denominator of b(n)=sum (k'&lt;=n,1/k') where k' denotes the squarefree numbers.
 * @author Sean A. Irvine
 */
public class A072983 extends A072980 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

