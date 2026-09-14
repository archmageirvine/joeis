package irvine.oeis.a086;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086554 a(1) = 1; for n&gt;1, a(n) = smallest number not included earlier such that each P+1 is prime, where P is the product of an (n-1)-set from the previous n terms.
 * @author Sean A. Irvine
 */
public class A086554 extends Sequence1 {

  private final List<Z> mA = new ArrayList<>();
  private Z mProd = null;
  private long mM = 1;

  private boolean is(final long m) {
    final Z t = mProd.multiply(m);
    for (final Z x : mA) {
      if (!t.divide(x).add(1).isProbablePrime()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (mProd == null) {
      mA.add(Z.ONE);
      mProd = Z.ONE;
      return Z.ONE;
    }
    while (true) {
      if (is(++mM)) {
        mProd = mProd.multiply(mM);
        mA.add(Z.valueOf(mM));
        return Z.valueOf(mM);
      }
    }
  }
}

