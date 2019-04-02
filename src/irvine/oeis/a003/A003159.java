package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003159 Numbers n whose binary representation ends in an even number of zeros.
 * @author Sean A. Irvine
 */
public class A003159 implements Sequence {

  private long mN = 0;

  private boolean endsWithEvenZeros(long n) {
    assert n > 0;
    boolean even = true;
    while ((n & 1) == 0) {
      even = !even;
      n >>>= 1;
    }
    return even;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (endsWithEvenZeros(mN)) {
        return Z.valueOf(mN);
      }
    }
  }

}
