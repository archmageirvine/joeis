package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049329 Numbers n such that n is a substring of n^n.
 * @author Sean A. Irvine
 */
public class A049329 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      if (n.pow(mN).toString().contains(String.valueOf(mN))) {
        return n;
      }
    }
  }
}
