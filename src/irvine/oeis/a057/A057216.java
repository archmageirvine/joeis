package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057216 To get next term, multiply by 17, add 1 and discard any prime factors &lt; 17.
 * @author Sean A. Irvine
 */
public class A057216 implements Sequence {

  private static final long[] SMALL = {3, 5, 7, 11, 13};
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.valueOf(61);
    } else {
      mA = mA.multiply(17).add(1).makeOdd();
      for (final long p : SMALL) {
        while (mA.mod(p) == 0) {
          mA = mA.divide(p);
        }
      }
    }
    return mA;
  }
}
