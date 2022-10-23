package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A032740 Numbers k such that k is a substring of 2^k.
 * @author Sean A. Irvine
 */
public class A032740 extends Sequence1 {

  private int mN = 5;

  @Override
  public Z next() {
    while (true) {
      if (Z.ONE.shiftLeft(++mN).toString().contains(String.valueOf(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
