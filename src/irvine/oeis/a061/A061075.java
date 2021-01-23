package irvine.oeis.a061;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.Sequence;

/**
 * A061075 Greatest prime number p(n) with decimal fraction period of length n.
 * @author Sean A. Irvine
 */
public class A061075 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    final Z[] f = Jaguar.factor(Cyclotomic.cyclotomic(++mN, 10)).toZArray();
    return f[f.length - 1];
  }
}

