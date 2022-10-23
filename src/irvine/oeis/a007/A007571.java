package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007571 a(n) = largest prime factor of n^n + 1.
 * @author Sean A. Irvine
 */
public class A007571 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final Z[] f = Jaguar.factor(Z.valueOf(++mN).pow(mN).add(1)).toZArray();
    return f[f.length - 1];
  }
}
