package irvine.oeis.a080;

import irvine.math.z.Z;

/**
 * A080927 Where records occur in A080905 (endpoints of record runs).
 * @author Sean A. Irvine
 */
public class A080927 extends A080905 {

  private Z mM = Z.ONE;
  private Z mMax = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z r = super.next();
      mM = mM.add(r);
      if (r.compareTo(mMax) > 0) {
        mMax = r;
        return mM;
      }
    }
  }
}

