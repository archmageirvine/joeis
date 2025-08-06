package irvine.oeis.a079;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A079278 Define a rational sequence {b(n)} as b(1) = 1, b(n) = b(n-1) + 1/(1 + 1/b(n-1)) for n &gt; 1; a(n) is the denominator of b(n).
 * @author Sean A. Irvine
 */
public class A079278 extends A079269 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

