package irvine.oeis.a073;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073673 Rearrangement of natural numbers such that every partial product + 1 is a prime.
 * @author Sean A. Irvine
 */
public class A073673 extends Sequence1 {

  private final HashSet<Long> mUsed = new HashSet<>();
  private Z mProd = null;

  @Override
  public Z next() {
    if (mProd == null) {
      mProd = Z.ONE;
      return Z.ONE;
    } else {
      long k = 1;
      while (true) {
        if (!mUsed.contains(++k)) {
          final Z t = mProd.multiply(k);
          if (t.add(1).isProbablePrime()) {
            mProd = t;
            mUsed.add(k);
            return Z.valueOf(k);
          }
        }
      }
    }
  }
}
