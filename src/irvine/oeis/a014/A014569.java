package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014569 Super-3 Numbers <code>(3n^3</code> contains substring '333' in its decimal expansion).
 * @author Sean A. Irvine
 */
public class A014569 implements Sequence {

  private Z mN = Z.valueOf(260);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.pow(3).multiply(3).toString().contains("333")) {
        return mN;
      }
    }
  }
}
