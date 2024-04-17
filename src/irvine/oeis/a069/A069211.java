package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069211 Let u(n,k) be the recursion: u(n,1)=1, u(n,2)=n, u(n,k+2) = (1/2) * (u(n,k+1)+u(n,k)) if u(n,k+1)+u(n,k) is even, and u(n,k+2) = abs(u(n,k+1)-u(n,k)) otherwise. Sequence gives integer values a(n) such that u(n,k)=1 for any k&gt;=a(n).
 * @author Sean A. Irvine
 */
public class A069211 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z a = Z.ONE;
    Z b = mN;
    long k = 1;
    while (!Z.ONE.equals(b) || !Z.ONE.equals(a)) {
      final Z t = a.add(b);
      if (t.isEven()) {
        a = b;
        b = t.divide2();
      } else {
        final Z u = b.subtract(a).abs();
        a = b;
        b = u;
      }
      ++k;
    }
    return Z.valueOf(k);
  }
}

