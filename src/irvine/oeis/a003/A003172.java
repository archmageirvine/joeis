package irvine.oeis.a003;

import irvine.math.group.QuadraticFieldUtils;
import irvine.math.z.Z;
import irvine.oeis.a005.A005117;

/**
 * A003172 <code>Q(sqrt n)</code> is a unique factorization domain (or simple quadratic field).
 * @author Sean A. Irvine
 */
public class A003172 extends A005117 {

  {
    super.next();
  }

  protected long targetClassNumber() {
    return 1;
  }

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (QuadraticFieldUtils.classNumber(n.multiply(n.mod(4) > 1 ? 4 : 1)) == targetClassNumber()) {
        return n;
      }
    }
  }
}
