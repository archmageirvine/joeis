package irvine.oeis.a061;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061075 Greatest prime number p(n) with decimal fraction period of length n.
 * @author Sean A. Irvine
 */
public class A061075 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final int n = ++mN;
    final Z[] f = Jaguar.factor(Functions.CYCLOTOMIC.z(n, Z.valueOf(10))).toZArray();
    return f[f.length - 1];
  }
}

