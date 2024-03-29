package irvine.oeis.a056;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A056729 If p | n, then p+1 | n+1 for composite n.
 * @author Sean A. Irvine
 */
public class A056729 extends A002808 {

  private boolean is(final Z n) {
    final Z n1 = n.add(1);
    for (final Z p : Jaguar.factor(n).toZArray()) {
      if (!n1.mod(p.add(1)).isZero()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (is(n)) {
        return n;
      }
    }
  }
}
