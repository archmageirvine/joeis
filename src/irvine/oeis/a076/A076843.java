package irvine.oeis.a076;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A076843 Denominators of sequence of fractions defined by a(1) = a(2) = 1; for n &gt; 2, a(n) = (a(n-1)+a(n-2)+1)/a(n-2).
 * @author Sean A. Irvine
 */
public class A076843 extends A076842 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
