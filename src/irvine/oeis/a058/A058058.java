package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058058 Generalized Somos-7 sequence: a(n)*a(n+7) = 3*a(n+1)*a(n+6) - 4*a(n+2)* a(n+5) + 4*a(n+3)*a(n+4).
 * @author Sean A. Irvine
 */
public class A058058 extends Sequence1 {

  private final Z[] mA = new Z[7];

  @Override
  public Z next() {
    if (mA[6] == null) {
      for (int k = 0; k < mA.length; ++k) {
        if (mA[k] == null) {
          mA[k] = Z.ONE;
          return Z.ONE;
        }
      }
    }
    final Z t = mA[6].multiply(mA[1]).multiply(3).subtract(mA[5].multiply(mA[2]).multiply(4)).add(mA[4].multiply(mA[3]).multiply(4)).divide(mA[0]);
    System.arraycopy(mA, 1, mA, 0, mA.length - 1);
    mA[6] = t;
    return t;
  }
}

