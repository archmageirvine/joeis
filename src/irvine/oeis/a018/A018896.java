package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018896.
 * @author Sean A. Irvine
 */
public class A018896 implements Sequence {

  private final Z[] mA = new Z[8];

  @Override
  public Z next() {
    if (mA[7] == null) {
      int k = 0;
      while (mA[k] != null) {
        ++k;
      }
      mA[k] = Z.ONE;
      return Z.ONE;
    } else {
      final Z t = mA[7].multiply(mA[1]).add(mA[4].square()).divide(mA[0]);
      System.arraycopy(mA, 1, mA, 0, 7);
      mA[7] = t;
      return t;
    }
  }
}

