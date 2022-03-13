package irvine.oeis.a055;

import irvine.math.z.Z;

/**
 * A055095 a(n) = 2*A000120(A003188(A055094(n))) - (n-1) = 2*A005811(A055094(n)) - (n-1).
 * @author Sean A. Irvine
 */
public class A055095 extends A055094 {

  @Override
  public Z next() {
    final Z t = super.next();
    if (t.isZero()) {
      return Z.ZERO;
    }
    long r = 1;
    Z m = t.divide2();
    boolean c = t.isOdd();
    while (!m.isZero()) {
      if (m.isOdd() != c) {
        ++r;
        c = !c;
      }
      m = m.divide2();
    }
    return Z.valueOf(2L * r - mN + 1);
  }
}
