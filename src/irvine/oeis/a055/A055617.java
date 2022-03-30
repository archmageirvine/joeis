package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055617 a(n)= A*10^(3*n)+B with A=(10^(3*n)-10^n) and B=10^(2*n).
 * @author Sean A. Irvine
 */
public class A055617 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final Z t3 = Z.TEN.pow(3 * ++mN);
    return t3.subtract(Z.TEN.pow(mN)).multiply(t3).add(Z.TEN.pow(2 * mN));
  }
}

