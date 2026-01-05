package irvine.oeis.a083;

import java.util.LinkedList;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A083020 Prime factors of 3^(3^n) + 2.
 * @author Sean A. Irvine
 */
public class A083020 extends Sequence0 {

  private final LinkedList<Z> mA = new LinkedList<>();
  private int mN = -1;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      final FactorSequence fs = Jaguar.factor(Z.THREE.pow(Z.THREE.pow(++mN)).add(2));
      for (final Z p : fs.toZArray()) {
        for (int k = 0; k < fs.getExponent(p); ++k) {
          mA.add(p);
        }
      }
    }
    return mA.pollFirst();
  }
}
