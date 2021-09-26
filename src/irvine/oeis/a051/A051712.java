package irvine.oeis.a051;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051712 Numerator of b(n)-b(n+1), where b(n) = n/((n+1)(n+2)) = A026741/A045896.
 * @author Sean A. Irvine
 */
public class A051712 implements Sequence {

  private long mN = 0;

  private Q b(final long n) {
    return new Q(n, (n + 1) * (n + 2));
  }

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    return select(b(++mN).subtract(b(mN + 1)));
  }
}
