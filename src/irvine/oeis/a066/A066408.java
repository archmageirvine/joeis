package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066408 Numbers n such that the Eisenstein integer (1 - \u03c9)^n - 1 has prime norm, where \u03c9 = -1/2 + sqrt(-3)/2.
 * @author Sean A. Irvine
 */
public class A066408 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 0;

  @Override
  public Z next() {
    if (mP == 0) {
      mP = 2;
      return Z.TWO;
    }
    while (true) {
      mP = mPrime.nextPrime(mP);
      final Z t = Z.THREE.pow(mP).subtract(Z.THREE.pow((mP + 1) / 2).multiply(Functions.KRONECKER.i(3, mP))).add(1);
      if (t.isProbablePrime()) {
        return Z.valueOf(mP);
      }
    }
  }
}
