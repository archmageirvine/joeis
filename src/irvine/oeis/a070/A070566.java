package irvine.oeis.a070;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070566.
 * @author Sean A. Irvine
 */
public class A070566 extends Sequence1 {

  // Based on the convoluted description in the paper.

  private final Fast mPrime = new Fast();
  private Z mC = null;
  private Z mP = Z.THREE;
  private long mD = 0;
  private List<Long> mA = null;

  private void updateA() {
    if (mA == null) {
      mA = Collections.singletonList(1L);
    } else {
      final List<Long> newA = new ArrayList<>();
      long p = 2;
      for (int i = 0; i < mA.size(); ++i, p = mPrime.nextPrime(p)) {
        long v = mA.get(i) - mD;
        while (v < 0) {
          v += p;
        }
        newA.add(v);
      }
      if (mC.equals(mP.square())) {
        newA.add(0L);
        mP = mPrime.nextPrime(mP);
      }
      mA = newA;
    }
  }

  private void updateD() {
    updateA();
    if (mD == 0) {
      mD = 1;
    } else {
      long k = 2;
      while (mA.contains(k)) {
        k += 2;
      }
      mD = k;
    }
  }

  @Override
  public Z next() {
    if (mC == null) {
      mC = Z.TWO;
    } else {
      updateD();
      mC = mC.add(mD);
    }
    return mC;
  }
}

