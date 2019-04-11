package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007571 <code>a(n) =</code> largest prime factor of <code>n^n + 1</code>.
 * @author Sean A. Irvine
 */
public class A007571 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    final Z[] f = Jaguar.factor(Z.valueOf(++mN).pow(mN).add(1)).toZArray();
    return f[f.length - 1];
  }
}
