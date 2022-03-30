package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055618 a(n) = A*10^(4*n-1)+B with A=990*(10^(4*n)-1)/9999 and B=990000*(10^(4*n-4)-1)/9999+100.
 * @author Sean A. Irvine
 */
public class A055618 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final Z t4 = Z.TEN.pow(4 * ++mN - 1);
    final Z a = t4.multiply(10).subtract(1).multiply(990).divide(9999);
    return a.multiply(t4).add(Z.TEN.pow(4 * mN - 4).subtract(1).multiply(990000).divide(9999)).add(100);
  }
}
