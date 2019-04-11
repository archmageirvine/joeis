package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007377 Numbers n such that the decimal expansion of <code>2^n</code> contains no 0.
 * @author Sean A. Irvine
 */
public class A007377 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (!Z.ONE.shiftLeft(++mN).toString().contains("0")) {
        return Z.valueOf(mN);
      }
    }
  }
}
