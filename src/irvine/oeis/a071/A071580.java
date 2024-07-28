package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071576.
 * @author Sean A. Irvine
 */
public class A071580 extends Sequence1 {

  private Z mProd = null;

  @Override
  public Z next() {
    if (mProd == null) {
      mProd = Z.TWO;
      return Z.TWO;
    }
    long k = 0;
    while (true) {
      final Z t = mProd.multiply(++k).add(1);
      if (t.isProbablePrime()) {
        mProd = mProd.multiply(t);
        return t;
      }
    }
  }
}

