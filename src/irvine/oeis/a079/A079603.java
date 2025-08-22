package irvine.oeis.a079;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079603 "Trim" numbers: see reference for definition.
 * @author Sean A. Irvine
 */
public class A079603 extends Sequence1 {

  // Based on the convoluted description in the paper.

  private final Fast mPrime = new Fast();
  private Z mT = null;
  private long mD = 0;
  private List<Long> mA = null;
  private boolean mSawZero = false;

  private void updateA() {
    if (mA == null) {
      mA = Collections.singletonList(1L);
    } else {
      final List<Long> newA = new ArrayList<>();
      newA.add(1L);
      long p = 2;
      boolean sawZero = false;
      for (int i = 1; i < mA.size(); ++i, p = mPrime.nextPrime(p)) {
        long v = mA.get(i) - mD;
        while (v < 0) {
          v += p;
        }
        if (v == 0) {
          sawZero = true;
        }
        newA.add(v);
      }
      if (!mSawZero) {
        newA.add(p - mD);
      }
      mSawZero = sawZero;
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
    if (mT == null) {
      mT = Z.TWO;
    } else {
      updateD();
      mT = mT.add(mD);
    }
    return mT;
  }
}

