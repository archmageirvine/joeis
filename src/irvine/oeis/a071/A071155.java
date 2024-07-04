package irvine.oeis.a071;

import irvine.math.z.Z;

/**
 * A071155 The Catalan factorial walks (for each rooted plane tree encoded by A014486) encoded as zero-free numbers in factorial base (A007623).
 * @author Sean A. Irvine
 */
public class A071155 extends A071157 {

  static Z factorialBaseToZ(Z t) {
    Z f = Z.ONE;
    Z s = Z.ZERO;
    long m = 1;
    while (!t.isZero()) {
      final Z[] qr = t.divideAndRemainder(Z.TEN);
      s = s.add(f.multiply(qr[1]));
      t = qr[0];
      f = f.multiply(++m);
    }
    return s;
  }

  @Override
  public Z next() {
    return factorialBaseToZ(super.next());
  }
}
