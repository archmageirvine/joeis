package irvine.oeis.a359;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A359841 Integers Xd which are divisible by X, where d is the last decimal digit.
 * @author Georg Fischer
 */
public class A359841 extends Sequence1 {

  private long mN = 9;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final long prefix = mN / 10L;
      if (mN % prefix == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
