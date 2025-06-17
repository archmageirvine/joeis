package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A078108 Let u(1)=u(2)=1, u(3)=2n, u(k) = abs(u(k-1)-u(k-2)-u(k-3)) and M(k)= Max( u(i) : 1&lt;=i&lt;=k), then for any k&gt;=A078109(n), M(k)=sqrtint(k + a(n)) where sqrtint(x) denotes floor(sqrt(x)).
 * @author Sean A. Irvine
 */
public class A078108 extends Sequence1 implements Conjectural {

  private static final int HEURISTIC = 1000;
  private long mN = 0;

  @Override
  public Z next() {
    Z u1 = Z.ONE;
    Z u2 = Z.ONE;
    Z u3 = Z.valueOf(2L * ++mN);
    Z max = u3;
    long k = 3;
    long cnt = 0;
    while (true) {
      ++k;
      final Z v1 = u3.subtract(u2).subtract(u1).abs();
      u1 = u2;
      u2 = u3;
      u3 = v1;
      if (v1.compareTo(max) > 0) {
        final Z t = v1.square().subtract(k);
        if (t.add(k - 1).sqrt().equals(max)) {
          if (++cnt > HEURISTIC) {
            return t;
          }
        } else {
          cnt = 0;
        }
        max = v1;
      }
    }
  }
}

