package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A066479 a(n) = min( x : x^3+n^3+x^2+n^2+x+n=1 mod(x+n)).
 * @author Sean A. Irvine
 */
public class A066479 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    final Z n3 = Z.valueOf(++mN).pow(3);
    long k = 0;
    while (true) {
      final Z t = n3.add(Z.valueOf(++k).pow(3)).add(mN * mN).add(k * k).add(mN + k);
      if (t.mod(mN + k) == 1) {
        return Z.valueOf(k);
      }
    }
  }
}

