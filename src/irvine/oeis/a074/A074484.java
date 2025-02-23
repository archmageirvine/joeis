package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A074484 a(n) = b(A074483(n), n), where b(k) is the recursion: b(1,n)=1, b(k+1,n)=b(k,n) + (b(k,n) reduced mod(k+n)) (cf. A074482).
 * @author Sean A. Irvine
 */
public class A074484 extends Sequence0 {

  private long mN = -2;

  @Override
  public Z next() {
    if (++mN == -1) {
      return Z.valueOf(38606);
    }
    Z a = Z.ONE;
    Z x = Z.ZERO;
    Z t = Z.ZERO;
    long k = 1;
    while (true) {
      final Z ox = x;
      final Z y = t;
      t = a;
      a = a.add(a.mod(mN + ++k));
      x = a.subtract(t);
      if (x.equals(ox)) {
        return y;
      }
    }
  }
}

