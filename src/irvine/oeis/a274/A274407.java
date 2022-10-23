package irvine.oeis.a274;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A274407 Numbers n with the property that when divided by their last digit the remainder of the division is their penultimate digit.
 * @author Georg Fischer
 */
public class A274407 extends Sequence1 {

  private long mN = 9;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final long dig0 = mN % 10;
      if (dig0 != 0) {
        final long dig1 = (mN % 100 - dig0) / 10;
        if (mN % dig0 == dig1) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
