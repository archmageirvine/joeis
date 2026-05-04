package irvine.oeis.a057;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A057867 Sum_{k&gt;=1} 1/(tanh(k*Pi) * k^(4n-1)) = Pi^(4n-1)*A057866(n)/a(n).
 * @author Sean A. Irvine
 */
public class A057867 extends A057866 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
