package irvine.oeis.a078;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078113 Let u(1)=u(2)=1, u(3)=n, u(k) = (1/2)*abs(2*u(k-1) -u(k-2)-u(k-3)); sequence gives values of n such that sum(k&gt;=1, u(k)) is an integer.
 * @author Sean A. Irvine
 */
public class A078113 extends Sequence1 {

  // Same conjectural limits as existing OEIS code
  private static final CR TOLERANCE = CR.valueOf(Z.TEN.pow(11)).inverse();
  private static final int HEURISTIC = 200;
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      Q u1 = Q.ONE;
      Q u2 = Q.ONE;
      Q u3 = Q.valueOf(++mN);
      CR sum = CR.valueOf(mN + 2);
      for (int k = 4; k < HEURISTIC; ++k) {
        final Q v1 = u3.multiply(2).subtract(u2).subtract(u1).abs().multiply(Q.HALF);
        u1 = u2;
        u2 = u3;
        u3 = v1;
        sum = sum.add(v1);
      }
      if (CR.valueOf(sum.ceil()).subtract(sum).compareTo(TOLERANCE) < 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

