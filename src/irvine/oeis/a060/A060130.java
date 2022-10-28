package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a007.A007623;

/**
 * A060130 Number of nonzero digits in factorial base representation (A007623) of n; minimum number of transpositions needed to compose each permutation in the lists A060117 &amp; A060118.
 * @author Sean A. Irvine
 */
public class A060130 extends A007623 {

  @Override
  public Z next() {
    int cnt = 0;
    Z t = super.next();
    while (!t.isZero()) {
      final Z[] qr = t.divideAndRemainder(Z.TEN);
      if (!qr[1].isZero()) {
        ++cnt;
      }
      t = qr[0];
    }
    return Z.valueOf(cnt);
  }
}
