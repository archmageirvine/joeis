package irvine.oeis.a055;

import irvine.math.z.Z;

/**
 * A055676 b(n)-a(n), where a, b are given by A055674, A055675.
 * @author Sean A. Irvine
 */
public class A055676 extends A055674 {

  @Override
  public Z next() {
    final Z a = super.next();
    return Z.valueOf(mB.get(mB.size() - 1)).subtract(a);
  }
}
