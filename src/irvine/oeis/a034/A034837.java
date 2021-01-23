package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034837 Numbers that are divisible by first digit.
 * @author Sean A. Irvine
 */
public class A034837 implements Sequence {

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
