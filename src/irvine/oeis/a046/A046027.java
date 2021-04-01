package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a013.A013929;

/**
 * A046027 Smallest multiple prime factor of the n-th nonsquarefree number (A013929).
 * @author Sean A. Irvine
 */
public class A046027 extends A013929 {

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(super.next());
    for (final Z p : fs.toZArray()) {
      if (fs.getExponent(p) > 1) {
        return p;
      }
    }
    throw new RuntimeException();
  }
}
