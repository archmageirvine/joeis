package irvine.oeis.a162;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A162534 A positive integer k is included if every length of the runs of 0's and 1's in the binary representation of k divides k.
 * @author Sean A. Irvine
 */
public class A162534 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z v = Z.valueOf(++mN);
      if (A162536.test(v, mN)) {
        return v;
      }
    }
  }
}

