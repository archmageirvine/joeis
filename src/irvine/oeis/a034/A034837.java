package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034837 Numbers that are divisible by the first, i.e., the leftmost, digit.
 * @author Sean A. Irvine
 */
public class A034837 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN % (String.valueOf(mN).charAt(0) - '0') == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
