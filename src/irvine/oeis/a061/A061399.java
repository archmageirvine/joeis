package irvine.oeis.a061;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A061399 Number of nonsquarefree integers between primes p(n) and p(n+1).
 * @author Sean A. Irvine
 */
public class A061399 extends A000040 {

  @Override
  public Z next() {
    Z t = super.next().add(1);
    long cnt = 0;
    while (!t.isProbablePrime()) {
      if (!Jaguar.factor(t).isSquareFree()) {
        ++cnt;
      }
      t = t.add(1);
    }
    return Z.valueOf(cnt);
  }
}

