package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078098 Let u(1)=u(2)=1, u(3)=2n+1, u(k)=abs(u(k-1)-u(k-2)-u(k-3)); then for any n (u(k),u(k+1)) = (v(n),w(n)) for k large enough; sequence gives values of Max(v(n),w(n)).
 * @author Sean A. Irvine
 */
public class A078098 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z u1 = Z.ONE;
    Z u2 = Z.ONE;
    Z u3 = Z.valueOf(2L * ++mN + 1);
    while (true) {
      // Do three steps
      final Z v1 = u3.subtract(u2).subtract(u1).abs();
      final Z v2 = v1.subtract(u3).subtract(u2).abs();
      final Z v3 = v2.subtract(v1).subtract(u3).abs();
      if (v3.equals(v1) && v2.equals(u3) && v1.equals(u2)) {
        return v3.max(v2);
      }
      u1 = v1;
      u2 = v2;
      u3 = v3;
    }
  }
}

