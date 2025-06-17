package irvine.oeis.a078;

import irvine.math.z.Z;

/**
 * A078109 Let u(1)=u(2)=1, u(3)=2n, u(k) = abs(u(k-1)-u(k-2)-u(k-3)) and M(k)= Max( u(i) : 1&lt;=i&lt;=k), then for any k&gt;=a(n), M(k)=sqrtint(k + A078108(n)) where sqrtint(x) denotes floor(sqrt(x)).
 * @author Sean A. Irvine
 */
public class A078109 extends A078108 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z t = super.next();
    if (++mN == 1) {
      return Z.THREE; // don't know why this is needed
    }
    Z u1 = Z.ONE;
    Z u2 = Z.ONE;
    Z u3 = Z.valueOf(2L * mN);
    Z max = u3;
    long k = 3;
    while (true) {
      ++k;
      final Z v1 = u3.subtract(u2).subtract(u1).abs();
      u1 = u2;
      u2 = u3;
      u3 = v1;
      if (v1.compareTo(max) > 0) {
        max = v1;
        if (t.add(k).sqrt().equals(max)) {
          return Z.valueOf(k);
        }
      }
    }
  }
}

