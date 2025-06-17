package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078117 Let u(1)=n, u(2)=n+1, v(1)=n+2, v(2)=n+3, u(k)=abs(u(k-1)-v(k-2)), v(k)=abs(v(k-1)-u(k-2)), then a(n) is the smallest integer such that for any k&gt;=a(n), v(k)=u(k).
 * @author Sean A. Irvine
 */
public class A078117 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z u1 = Z.valueOf(++mN);
    Z u2 = Z.valueOf(mN + 1);
    Z v1 = Z.valueOf(mN + 2);
    Z v2 = Z.valueOf(mN + 3);
    long k = 2;
    while (true) {
      ++k;
      final Z u = u2.subtract(v1).abs();
      final Z v = v2.subtract(u1).abs();
      if (u.equals(v) && u2.equals(v2) && u1.equals(v1)) {
        return Z.valueOf(k - 2);
      }
      u1 = u2;
      u2 = u;
      v1 = v2;
      v2 = v;
    }
  }
}

