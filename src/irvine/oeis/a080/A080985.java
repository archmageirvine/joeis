package irvine.oeis.a080;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A080985 Define b by b(1) = 1 and for n&gt;1, b(n) = b(n-1)+1/(2+1/b(n-1)); sequence gives denominator of b(n).
 * @author Sean A. Irvine
 */
public class A080985 extends A080984 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

