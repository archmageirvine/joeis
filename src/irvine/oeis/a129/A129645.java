package irvine.oeis.a129;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A129645.
 * @author Sean A. Irvine
 */
public class A129645 implements Sequence {

  private int mN = 0;
  private Z mPrev = null;
  private final ArrayList<Z> mB = new ArrayList<>();

  @Override
  public Z next() {
    if (mPrev == null) {
      mPrev = Z.ONE;
      mB.add(Z.ONE);
    } else {
      mPrev = mPrev.multiply(mB.get(mN++)).add(1);
      Collections.addAll(mB, Cheetah.factor(mPrev).divisors());
    }
    return mPrev;
  }
}

