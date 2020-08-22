package irvine.oeis.a129;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A129645 a(1) = 1; for n&gt;1, a(n) = a(n-1)*b(n-1) + 1, where {b(k)} is the concatenated list of the ordered positive divisors of the terms of {a(k)}.
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

