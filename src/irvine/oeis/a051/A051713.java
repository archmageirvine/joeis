package irvine.oeis.a051;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A051713 Denominator of b(n)-b(n+1), where b(n) = n/((n+1)(n+2)) = A026741/A045896.
 * @author Sean A. Irvine
 */
public class A051713 extends A051712 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
