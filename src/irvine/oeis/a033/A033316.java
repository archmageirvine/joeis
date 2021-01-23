package irvine.oeis.a033;

import irvine.math.z.Z;

/**
 * A033316 Value of D for incrementally largest values of minimal x satisfying Pell equation x^2-Dy^2=1.
 * @author Sean A. Irvine
 */
public class A033316 extends A033313 {

  private Z mMax = null;

  @Override
  public Z next() {
    if (mMax == null) {
      mMax = Z.ZERO;
      return Z.ONE;
    }
    while (true) {
      final Z x = super.next();
      if (x.compareTo(mMax) > 0) {
        mMax = x;
        return mD;
      }
    }
  }
}

