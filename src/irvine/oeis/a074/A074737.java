package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074737 Let b(1)=b(2)=1, b(k+2)=gcd(k!,b(k+1)+b(k)); sequence gives values of k such that b(k)=1.
 * @author Sean A. Irvine
 */
public class A074737 extends Sequence1 {

  private Z mA = Z.ONE;
  private Z mB = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN <= 2) {
        return Z.valueOf(mN);
      }
      final Z t = Functions.GCD.z(Functions.FACTORIAL.z(mN - 2), mA.add(mB));
      mA = mB;
      mB = t;
      if (t.equals(Z.ONE)) {
        return Z.valueOf(mN);
      }
    }
  }
}
