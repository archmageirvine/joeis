package irvine.oeis.a028;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028965 Six consecutive integers with increasing values of sigma start at these numbers; i.e., sigma(x) &lt; sigma(x+1) &lt;  ... &lt; sigma(x+5).
 * @author Sean A. Irvine
 */
public class A028965 implements Sequence {

  private long mN = 36721680;
  private Z[] mA = new Z[6];

  @Override
  public Z next() {
    if (mA[0] == null) {
      for (int k = 0; k < mA.length; ++k) {
        mA[k] = Jaguar.factor(mN + k).sigma();
      }
    }
    while (true) {
      System.arraycopy(mA, 1, mA, 0, 5);
      mA[5] = Jaguar.factor(++mN + 5).sigma();
      if (mA[4].compareTo(mA[5]) < 0
        && mA[3].compareTo(mA[4]) < 0
        && mA[2].compareTo(mA[3]) < 0
        && mA[1].compareTo(mA[2]) < 0
        && mA[0].compareTo(mA[1]) < 0
      ) {
        return Z.valueOf(mN);
      }
    }
  }
}
