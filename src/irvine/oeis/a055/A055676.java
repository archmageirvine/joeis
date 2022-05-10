package irvine.oeis.a055;

import irvine.math.z.Z;

/**
 * A055676 a(n) = A055675(n) - A055674(n).
 * @author Sean A. Irvine
 */
public class A055676 extends A055674 {

  @Override
  public Z next() {
    final Z a = super.next();
    return Z.valueOf(mB.get(mB.size() - 1)).subtract(a);
  }
}
