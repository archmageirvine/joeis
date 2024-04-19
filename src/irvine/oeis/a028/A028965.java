package irvine.oeis.a028;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028965 Six consecutive integers with increasing values of sigma start at these numbers; i.e., sigma(x) &lt; sigma(x+1) &lt;  ... &lt; sigma(x+5).
 * @author Sean A. Irvine
 */
public class A028965 extends Sequence1 {

  private long mN = 36721680;
  private final Z[] mA = new Z[6];

  @Override
  public Z next() {
    if (mA[0] == null) {
      for (int k = 0; k < mA.length; ++k) {
        mA[k] = Functions.SIGMA.z(mN + k);
      }
    }
    while (true) {
      System.arraycopy(mA, 1, mA, 0, 5);
      mA[5] = Functions.SIGMA.z(++mN + 5);
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
