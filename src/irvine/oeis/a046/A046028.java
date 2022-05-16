package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a013.A013929;

/**
 * A046028 Largest multiple prime factor of the n-th nonsquarefree number (A013929).
 * @author Sean A. Irvine
 */
public class A046028 extends A013929 {

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(super.next());
    final Z[] p = fs.toZArray();
    for (int k = p.length - 1; k >= 0; --k) {
      if (fs.getExponent(p[k]) > 1) {
        return p[k];
      }
    }
    throw new RuntimeException();
  }
}
