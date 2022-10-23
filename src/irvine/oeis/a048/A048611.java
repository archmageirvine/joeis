package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048611 Find smallest pair (x,y) such that x^2 - y^2 = 11...1 (n times) = (10^n-1)/9; sequence gives value of x.
 * @author Sean A. Irvine
 */
public class A048611 extends Sequence1 {

  // After Chai Wah Wu

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply(10);
    final Z[] d = Jaguar.factor(mA.subtract(1).divide(9)).divisorsSorted();
    return d[d.length / 2].add(d[(d.length - 1) / 2]).divide2();
  }
}

